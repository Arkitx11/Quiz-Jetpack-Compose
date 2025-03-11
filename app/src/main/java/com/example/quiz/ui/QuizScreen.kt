@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.quiz.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quiz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(viewModel: QuizViewModel) {
    val quizUiState by viewModel.uiState.collectAsState()
    Log.d("Progress Value", "${viewModel.currentQuestionIndex}")
    if (quizUiState.showResetDialog)
        ResetAlertDialogBox(
            onDismissRequest = {
                viewModel.resetDialogReset()
            },
            onConfirmation = {
                viewModel.onPressingResetButton()
            }
        )
    if (quizUiState.showScoreDialog)
        ScoreDialogBox(
            score = quizUiState.highScore,
            onConfirmation = {
                viewModel.onPressingResetButton()
            }
        )
    Scaffold(topBar = {
        Column {
            CenterAlignedTopAppBar(
                title = { Text("Quiz") },
                actions = {
                    IconButton(onClick = {
                        viewModel.onPressingResetIcon()
                    }) {
                        Icon(
                            painter = painterResource(R.drawable.baseline_restart_alt_24),
                            contentDescription = null
                        )
                    }
                },
            )
            LinearProgressIndicator(
                progress = quizUiState.quizProgress,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }) { innerPadding ->
        QuizScreenBody(modifier = Modifier.padding(innerPadding), viewModel = viewModel)
    }
}


@Composable
fun QuizScreenBody(modifier: Modifier = Modifier, viewModel: QuizViewModel) {
    val state by viewModel.uiState.collectAsState()
    val configuration = LocalConfiguration.current
    Column(
        modifier = modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height((configuration.screenHeightDp / 8).dp))
        Text(
            state.question,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height((configuration.screenHeightDp / 8).dp))
        MultiChoiceOptions(
            modifier = Modifier.padding(16.dp),
            optionList = state.options,
            viewModel = viewModel
        )
    }
}

@Composable
fun MultiChoiceOptions(
    modifier: Modifier = Modifier,
    optionList: List<String>,
    viewModel: QuizViewModel
) {

    Column(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = modifier) {
        Option(viewModel = viewModel, radioButtonLabel = optionList[0])
        Option(viewModel = viewModel, radioButtonLabel = optionList[1])
        Option(viewModel = viewModel, radioButtonLabel = optionList[2])
        Option(viewModel = viewModel, radioButtonLabel = optionList[3])
    }
}

@Composable
fun Option(
    radioButtonLabel: String,
    viewModel: QuizViewModel,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable(onClick = {
                viewModel.onTap(radioButtonLabel)
            })
            .fillMaxWidth(),
    ) {
        Icon(
            painter = painterResource(R.drawable.baseline_radio_button_unchecked_24),
            contentDescription = null
        )
        Spacer(Modifier.width(8.dp))
        Text(text = radioButtonLabel, color = MaterialTheme.colorScheme.onPrimaryContainer)
    }
}

@Composable
fun ScoreDialogBox(
    modifier: Modifier = Modifier,
    score: Int,
    onConfirmation: () -> Unit,
) {
    AlertDialog(
        modifier = modifier,
        title = {
            Text(text = stringResource(R.string.highscore_dialog_title))
        },
        text = {
            Text(text = stringResource(R.string.highscore_dialog_text, score))
        },
        confirmButton = {
            TextButton(onClick = {
                onConfirmation()
            }) {
                Text(stringResource(R.string.retry_button_label))
            }
        },
        onDismissRequest = {}

    )
}

@Composable
fun ResetAlertDialogBox(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    modifier: Modifier = Modifier
) {

    AlertDialog(
        modifier = modifier,

        title = {
            Text(text = stringResource(R.string.reset_dialog_title))
        },
        text = {
            Text(text = stringResource(R.string.reset_dialog_text))
        },
        onDismissRequest = {
            onDismissRequest()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation()
                }
            ) {
                Text(stringResource(R.string.reset_button_label))
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text(stringResource(R.string.cancel_button_label))
            }
        }
    )
}


@Preview
@Composable
private fun HighScoreDialogBoxPreview() {
    ScoreDialogBox(
        score = 30,
        onConfirmation = {})
}


@Preview
@Composable
private fun ResetAlertDialogBoxPreview() {
    ResetAlertDialogBox(
        onDismissRequest = {},
        onConfirmation = {})
}

@Preview
@Composable
private fun QuizScreenPreview() {
    QuizScreen(viewModel = QuizViewModel())
}