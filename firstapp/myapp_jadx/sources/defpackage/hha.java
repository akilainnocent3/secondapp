package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hha implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hha(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wz.a("WhatIsProvablyFairClicked", (String) obj2, new String[0]);
                ((Function0) obj).invoke();
                break;
            default:
                String str = ((gxo) ((ytw) obj).getValue()).f;
                str.getClass();
                ((nf50) obj2).A1(str);
                break;
        }
        return Unit.a;
    }
}
