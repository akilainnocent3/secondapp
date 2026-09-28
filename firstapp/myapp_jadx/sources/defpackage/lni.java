package defpackage;

import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel", f = "FootballViewModel.kt", l = {423, 467}, m = "uploadRewardShowOffData", v = 2)
public final class lni extends x1b {
    public String a;
    public MultipartBody.Part b;
    public h530 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dni e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lni(dni dniVar, x1b x1bVar) {
        super(x1bVar);
        this.e = dniVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.C1(null, null, this);
    }
}
