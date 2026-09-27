package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40819a;

    public ri(String actionName) {
        kotlin.jvm.internal.m0.p(actionName, "actionName");
        this.f40819a = actionName;
    }

    public final String a() {
        return this.f40819a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri) && kotlin.jvm.internal.m0.g(this.f40819a, ((ri) obj).f40819a);
    }

    public int hashCode() {
        return this.f40819a.hashCode();
    }

    public String toString() {
        return "UrlActionResult(actionName=" + this.f40819a + gi.j.f86771d;
    }
}
