package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb f40834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40836d;

    public s0(String str, jb jbVar, List trackingEvents, String str2) {
        kotlin.jvm.internal.m0.p(trackingEvents, "trackingEvents");
        this.f40833a = str;
        this.f40834b = jbVar;
        this.f40835c = trackingEvents;
        this.f40836d = str2;
    }

    public final jb a() {
        return this.f40834b;
    }

    public final String b() {
        return this.f40833a;
    }

    public final String c() {
        return this.f40836d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return kotlin.jvm.internal.m0.g(this.f40833a, s0Var.f40833a) && kotlin.jvm.internal.m0.g(this.f40834b, s0Var.f40834b) && kotlin.jvm.internal.m0.g(this.f40835c, s0Var.f40835c) && kotlin.jvm.internal.m0.g(this.f40836d, s0Var.f40836d);
    }

    public int hashCode() {
        String str = this.f40833a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jb jbVar = this.f40834b;
        int iHashCode2 = (((iHashCode + (jbVar == null ? 0 : jbVar.hashCode())) * 31) + this.f40835c.hashCode()) * 31;
        String str2 = this.f40836d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdVerification(vendor=" + this.f40833a + ", javaScriptResource=" + this.f40834b + ", trackingEvents=" + this.f40835c + ", verificationParameters=" + this.f40836d + gi.j.f86771d;
    }
}
