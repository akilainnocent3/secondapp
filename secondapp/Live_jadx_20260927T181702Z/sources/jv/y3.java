package jv;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class y3 extends CancellationException implements h0<y3> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    @oy.m
    public final transient o2 f100967b;

    public y3(@oy.l String str, @oy.m o2 o2Var) {
        super(str);
        this.f100967b = o2Var;
    }

    @Override // jv.h0
    @oy.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y3 d() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        y3 y3Var = new y3(message, this.f100967b);
        y3Var.initCause(this);
        return y3Var;
    }

    public y3(@oy.l String str) {
        this(str, null);
    }
}
