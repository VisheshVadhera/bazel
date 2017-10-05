package src.java_tools.codecompletion.java.com.google.codecompletion.server;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.eclipse.lsp4j.CodeActionParams;
import org.eclipse.lsp4j.CodeLens;
import org.eclipse.lsp4j.CodeLensParams;
import org.eclipse.lsp4j.Command;
import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionOptions;
import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeTextDocumentParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.DidCloseTextDocumentParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.DidSaveTextDocumentParams;
import org.eclipse.lsp4j.DocumentFormattingParams;
import org.eclipse.lsp4j.DocumentHighlight;
import org.eclipse.lsp4j.DocumentOnTypeFormattingParams;
import org.eclipse.lsp4j.DocumentRangeFormattingParams;
import org.eclipse.lsp4j.DocumentSymbolParams;
import org.eclipse.lsp4j.Hover;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.ReferenceParams;
import org.eclipse.lsp4j.RenameParams;
import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.lsp4j.SignatureHelp;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.lsp4j.WorkspaceSymbolParams;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;

public class SkylarkLanguageServer
    implements LanguageServer, WorkspaceService, TextDocumentService {

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
    return this;
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

  @Override
  public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(
      TextDocumentPositionParams textDocumentPositionParams) {
    return null;
  }

  @Override
  public CompletableFuture<CompletionItem> resolveCompletionItem(CompletionItem completionItem) {
    return null;
  }

  @Override
  public CompletableFuture<Hover> hover(TextDocumentPositionParams textDocumentPositionParams) {
    return null;
  }

  @Override
  public CompletableFuture<SignatureHelp> signatureHelp(
      TextDocumentPositionParams textDocumentPositionParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends Location>> definition(
      TextDocumentPositionParams textDocumentPositionParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends Location>> references(ReferenceParams referenceParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(
      TextDocumentPositionParams textDocumentPositionParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends SymbolInformation>> documentSymbol(
      DocumentSymbolParams documentSymbolParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends Command>> codeAction(CodeActionParams codeActionParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends CodeLens>> codeLens(CodeLensParams codeLensParams) {
    return null;
  }

  @Override
  public CompletableFuture<CodeLens> resolveCodeLens(CodeLens codeLens) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends TextEdit>> formatting(
      DocumentFormattingParams documentFormattingParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends TextEdit>> rangeFormatting(
      DocumentRangeFormattingParams documentRangeFormattingParams) {
    return null;
  }

  @Override
  public CompletableFuture<List<? extends TextEdit>> onTypeFormatting(
      DocumentOnTypeFormattingParams documentOnTypeFormattingParams) {
    return null;
  }

  @Override
  public CompletableFuture<WorkspaceEdit> rename(RenameParams renameParams) {
    return null;
  }

  @Override
  public void didOpen(DidOpenTextDocumentParams didOpenTextDocumentParams) {

  }

  @Override
  public void didChange(DidChangeTextDocumentParams didChangeTextDocumentParams) {

  }

  @Override
  public void didClose(DidCloseTextDocumentParams didCloseTextDocumentParams) {

  }

  @Override
  public void didSave(DidSaveTextDocumentParams didSaveTextDocumentParams) {

  }
}
