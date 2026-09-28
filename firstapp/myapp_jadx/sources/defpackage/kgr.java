package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kgr implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        khr.g gVar = (khr.g) obj;
        gVar.getClass();
        if (Intrinsics.g(gVar, khr.e.a)) {
            return "loading";
        }
        if (Intrinsics.g(gVar, khr.f.a)) {
            return "no_ticket";
        }
        if (gVar instanceof khr.c) {
            return "has_ticket";
        }
        uhc.a();
        return null;
    }
}
