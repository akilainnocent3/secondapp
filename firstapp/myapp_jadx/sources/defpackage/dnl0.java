package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class dnl0 implements c5l0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ iol0 c;

    public dnl0(iol0 iol0Var, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = iol0Var;
    }

    @Override // defpackage.c5l0
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.c.y(true, i, th, bArr, this.a, this.b);
    }
}
