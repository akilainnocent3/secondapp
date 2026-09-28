package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoHistoryActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class af5 extends cny {
    public final /* synthetic */ BuildAndGoHistoryActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af5(BuildAndGoHistoryActivity buildAndGoHistoryActivity) {
        super(true);
        this.d = buildAndGoHistoryActivity;
    }

    @Override // defpackage.cny
    public final void b() {
        int i = BuildAndGoHistoryActivity.i;
        BuildAndGoHistoryActivity buildAndGoHistoryActivity = this.d;
        if (!buildAndGoHistoryActivity.f) {
            buildAndGoHistoryActivity.finish();
            return;
        }
        azm azmVar = buildAndGoHistoryActivity.d;
        if (azmVar != null) {
            azmVar.d(wae.INSTANT_WIN_BUILD_AND_GO);
        } else {
            Intrinsics.n("router");
            throw null;
        }
    }
}
