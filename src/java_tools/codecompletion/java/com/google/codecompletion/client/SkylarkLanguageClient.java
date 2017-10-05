package src.java_tools.codecompletion.java.com.google.codecompletion.client;

import java.util.concurrent.CompletableFuture;
import org.eclipse.lsp4j.MessageActionItem;
import org.eclipse.lsp4j.MessageParams;
import org.eclipse.lsp4j.PublishDiagnosticsParams;
import org.eclipse.lsp4j.ShowMessageRequestParams;
import org.eclipse.lsp4j.services.LanguageClient;

public class SkylarkLanguageClient implements LanguageClient {

  @Override
  public void telemetryEvent(Object o) {

  }

  @Override
  public void publishDiagnostics(PublishDiagnosticsParams publishDiagnosticsParams) {

  }

  @Override
  public void showMessage(MessageParams messageParams) {

  }

  @Override
  public CompletableFuture<MessageActionItem> showMessageRequest(
      ShowMessageRequestParams showMessageRequestParams) {
    return null;
  }

  @Override
  public void logMessage(MessageParams messageParams) {

  }
}
