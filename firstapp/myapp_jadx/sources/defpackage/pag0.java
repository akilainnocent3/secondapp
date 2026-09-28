package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$21$1", f = "Tournament.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ SnapshotStateList<TournamentBannerConfig> a;
    public final /* synthetic */ ytw<n4g0> b;
    public final /* synthetic */ ytw<List<TournamentUserPlayInfo>> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pag0(SnapshotStateList<TournamentBannerConfig> snapshotStateList, ytw<n4g0> ytwVar, ytw<List<TournamentUserPlayInfo>> ytwVar2, ytw<Boolean> ytwVar3, v1b<? super pag0> v1bVar) {
        super(2, v1bVar);
        this.a = snapshotStateList;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pag0(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hfs hfsVar = kag0.a;
        n4g0 value = this.b.getValue();
        boolean z = value instanceof n4g0.b;
        ytw<List<TournamentUserPlayInfo>> ytwVar = this.c;
        SnapshotStateList<TournamentBannerConfig> snapshotStateList = this.a;
        if (z) {
            snapshotStateList.clear();
            n4g0.b bVar = (n4g0.b) value;
            snapshotStateList.addAll(bVar.a);
            ytwVar.setValue(bVar.b);
            if (bVar.c) {
                this.d.setValue(Boolean.FALSE);
            }
        } else {
            if (!Intrinsics.g(value, n4g0.a.a)) {
                uhc.a();
                return null;
            }
            snapshotStateList.clear();
            ytwVar.setValue(null);
        }
        return Unit.a;
    }
}
