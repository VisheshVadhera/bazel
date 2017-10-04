java_library(
    name = "codecompletion",
    srcs = glob(["java/com/google/codecompletion/*.java"]),
    deps = [
        ":org_eclipse_lsp4j",
        ":org_eclipse_lsp4j_jsonrpc",
    ],
)

java_import(
    name = "org_eclipse_lsp4j",
    jars = [
        "lsp4j/org.eclipse.lsp4j-0.3.0.jar",
    ],
)

java_import(
    name = "org_eclipse_lsp4j_jsonrpc",
    jars = [
        "lsp4j/org.eclipse.lsp4j.jsonrpc-0.3.0.jar",
    ],
)
