package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.uiprocess.LoadCodeUiProcess", f = "LoadCodeUiProcess.kt", l = {114, 151}, m = "loadIntoBetItem", v = 2)
public final class ows extends x1b {
    public v2b a;
    public List b;
    public Integer c;
    public String d;
    public lws e;
    public int f;
    public int i;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ pws y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ows(pws pwsVar, x1b x1bVar) {
        super(x1bVar);
        this.y = pwsVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, null, null, this);
    }
}
