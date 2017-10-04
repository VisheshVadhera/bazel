package src.java_tools.codecompletion.java.com.google.codecompletion;

import java.util.concurrent.CompletableFuture;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;

public class SkylarkLanguageServer implements LanguageServer {

  @Override
  public CompletableFuture<InitializeResult> initialize(InitializeParams initializeParams) {
    return null;
  }

  @Override
  public void initialized(InitializedParams initializedParams) {

  }

  @Override
  public CompletableFuture<Object> shutdown() {
    return null;
  }

  @Override
  public void exit() {

  }

  @Override
  public TextDocumentService getTextDocumentService() {
    return null;
  }

  @Override
  public WorkspaceService getWorkspaceService() {
    return null;
  }
}
