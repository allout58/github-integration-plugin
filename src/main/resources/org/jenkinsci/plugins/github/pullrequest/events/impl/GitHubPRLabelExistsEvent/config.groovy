package org.jenkinsci.plugins.github.pullrequest.events.impl.GitHubPRLabelExistsEvent;

def f = namespace(lib.FormTagLib);

f.entry(field: "skip", title: "Skip PR?") {
    f.checkbox()
}

f.entry() {
    f.property(field:"label")
}
