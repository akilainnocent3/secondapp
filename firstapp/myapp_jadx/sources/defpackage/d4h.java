package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.externalgames.model.GamesMetadataFilter;
import com.sportygames.externalgames.model.GamesMetadataResponse;
import com.sportygames.externalgames.model.GamesMetadataSortBy;
import com.sportygames.externalgames.model.GamesMetadataSortOrder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.externalgames.data.ExternalGamesRepository$getGamesMetadata$2", f = "ExternalGamesRepository.kt", l = {24}, m = "invokeSuspend", v = 1)
public final class d4h extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends GamesMetadataResponse>>>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ GamesMetadataFilter c;
    public final /* synthetic */ GamesMetadataSortBy d;
    public final /* synthetic */ GamesMetadataSortOrder e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4h(String str, GamesMetadataFilter gamesMetadataFilter, GamesMetadataSortBy gamesMetadataSortBy, GamesMetadataSortOrder gamesMetadataSortOrder, int i, int i2, v1b<? super d4h> v1bVar) {
        super(1, v1bVar);
        this.b = str;
        this.c = gamesMetadataFilter;
        this.d = gamesMetadataSortBy;
        this.e = gamesMetadataSortOrder;
        this.f = i;
        this.i = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new d4h(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends GamesMetadataResponse>>> v1bVar) {
        return ((d4h) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        Object value = on0.t.getValue();
        value.getClass();
        c4h c4hVar = (c4h) value;
        String strA = inm.a("sb_country=", this.b);
        GamesMetadataFilter gamesMetadataFilter = this.c;
        String strA2 = f4h.a(gamesMetadataFilter.getGameIds());
        String strA3 = f4h.a(gamesMetadataFilter.getBizTypes());
        String strA4 = f4h.a(gamesMetadataFilter.getCategoryIds());
        String strA5 = f4h.a(gamesMetadataFilter.getProviderIds());
        GamesMetadataSortBy gamesMetadataSortBy = this.d;
        String strName = gamesMetadataSortBy != null ? gamesMetadataSortBy.name() : null;
        GamesMetadataSortOrder gamesMetadataSortOrder = this.e;
        String strName2 = gamesMetadataSortOrder != null ? gamesMetadataSortOrder.name() : null;
        this.a = 1;
        Object objA = c4hVar.a(strA, strA2, strA3, strA4, strA5, strName, strName2, this.f, this.i, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
