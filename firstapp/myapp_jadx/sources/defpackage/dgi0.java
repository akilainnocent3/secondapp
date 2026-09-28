package defpackage;

import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dgi0 implements ud, paj {
    public final /* synthetic */ VirtualLobbyActivity a;

    public dgi0(VirtualLobbyActivity virtualLobbyActivity) {
        this.a = virtualLobbyActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = VirtualLobbyActivity.E;
        boolean z = gqkVar instanceof gqk.c;
        VirtualLobbyActivity virtualLobbyActivity = this.a;
        if (z) {
            virtualLobbyActivity.z1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            virtualLobbyActivity.z1().B1(aVar.a, aVar.b);
        } else if (gqkVar.equals(gqk.d.a)) {
            virtualLobbyActivity.z1().b0();
        } else {
            if (gqkVar.equals(gqk.b.a)) {
                return;
            }
            uhc.a();
        }
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, VirtualLobbyActivity.class, "onBuildAndGoGiftPickerResult", "onBuildAndGoGiftPickerResult(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ud) && (obj instanceof paj)) {
            return Intrinsics.g(c(), ((paj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
