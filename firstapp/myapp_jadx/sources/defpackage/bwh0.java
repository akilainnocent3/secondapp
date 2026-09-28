package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bwh0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gly glyVar = (gly) obj;
        return new jj0(Float.intBitsToFloat((int) (glyVar.a >> 32)), Float.intBitsToFloat((int) (glyVar.a & 4294967295L)));
    }
}
