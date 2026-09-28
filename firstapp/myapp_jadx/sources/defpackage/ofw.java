package defpackage;

import android.util.Range;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.data.repository.MultiMakerConfigsRepositoryImpl", f = "MultiMakerConfigsRepositoryImpl.kt", l = {100, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "setLastSelectionOddsRange", v = 2)
public final class ofw extends x1b {
    public Range a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pfw d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofw(pfw pfwVar, x1b x1bVar) {
        super(x1bVar);
        this.d = pfwVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.N(null, this);
    }
}
