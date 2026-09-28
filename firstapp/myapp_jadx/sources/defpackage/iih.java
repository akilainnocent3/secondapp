package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.externalgames.model.GamesMetadataSortBy;
import com.sportygames.externalgames.model.GamesMetadataSortOrder;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.game.usecase.FetchGamesMetadataUseCase", f = "FetchGamesMetadataUseCase.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 47}, m = "invoke-hUnOzRk", v = 2)
public final class iih extends x1b {
    public GamesMetadataSortBy a;
    public GamesMetadataSortOrder b;
    public String c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jih i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iih(jih jihVar, x1b x1bVar) {
        super(x1bVar);
        this.i = jihVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.i.a(null, null, null, 0, 0, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
