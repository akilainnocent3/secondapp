package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
public final class afp extends x1b {
    public m8d a;
    public bfp b;
    public LinkedHashMap c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bfp i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afp(bfp bfpVar, pz1 pz1Var) {
        super(pz1Var);
        this.i = bfpVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
