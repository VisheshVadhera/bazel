package src.java_tools.codecompletion.java.com.google.codecompletion;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.eclipse.lsp4j.CompletionOptions;
import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.WorkspaceSymbolParams;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;

public class SkylarkLanguageServer
    implements LanguageServer, WorkspaceService {

  private static final int FORCED_EXIT_CODE = 1;

  @Override
  public CompletableFuture<InitializeResult> initialize(InitializeParams initializeParams) {
    InitializeResult initializeResult = new InitializeResult();
    ServerCapabilities serverCapabilities = new ServerCapabilities();
    serverCapabilities
        .setCompletionProvider(new CompletionOptions(Boolean.TRUE, Arrays.asList(".", "@", "#")));
    serverCapabilities.setCodeActionProvider(Boolean.TRUE);
    initializeResult.setCapabilities(serverCapabilities);
    return CompletableFuture.completedFuture(initializeResult);
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
    Executors.newSingleThreadScheduledExecutor().schedule(() -> {
      System.exit(FORCED_EXIT_CODE);
    }, 1, TimeUnit.MINUTES);
  }

  @Override
  public TextDocumentService getTextDocumentService() {
    return null;
  }

  @Override
  public WorkspaceService getWorkspaceService() {
    return this;
  }

  @Override
  public CompletableFuture<List<? extends SymbolInformation>> symbol(
      WorkspaceSymbolParams workspaceSymbolParams) {
    return null;
  }

  @Override
  public void didChangeConfiguration(DidChangeConfigurationParams didChangeConfigurationParams) {

  }

  @Override
  public void didChangeWatchedFiles(DidChangeWatchedFilesParams didChangeWatchedFilesParams) {

  }
}
