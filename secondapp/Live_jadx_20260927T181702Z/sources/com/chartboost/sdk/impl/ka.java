package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface ka {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static CBError.Impression a(ka kaVar, String error) {
            kotlin.jvm.internal.m0.p(error, "error");
            return CBError.Impression.INTERNAL;
        }
    }

    void A();

    String B();

    String C();

    void a(float f10);

    void a(float f10, float f11);

    void a(l3 l3Var);

    void a(qj qjVar);

    void a(re reVar);

    void a(List list, Integer num);

    void a(boolean z10, String str);

    void b();

    void b(float f10);

    void b(l3 l3Var);

    void c(l3 l3Var);

    void c(String str);

    CBError.Impression d(String str);

    void d(l3 l3Var);

    void e(String str);

    void f();

    String h();

    void i();

    String j();

    void k();

    void l();

    void q();

    String s();

    void t();

    void u();

    void v();

    String w();

    void z();
}
