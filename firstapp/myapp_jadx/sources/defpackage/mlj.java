package defpackage;

import androidx.fragment.app.FragmentManager;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mlj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mlj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                GameMainActivity gameMainActivity = (GameMainActivity) obj;
                int i2 = GameMainActivity.N;
                String str = gameMainActivity.H1().i;
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 69387) {
                        if (iHashCode == 1037699538 ? str.equals("BONUS_VAULT") : iHashCode == 1887537372 && str.equals("STACKER_GAME")) {
                            gameMainActivity.G1().x1();
                            gameMainActivity.G1().A1();
                        }
                    } else if (str.equals("FBG")) {
                        gameMainActivity.G1().x1();
                        GameDetails gameDetails = gameMainActivity.y;
                        if (gameDetails == null) {
                            Intrinsics.n("gameDetails");
                            throw null;
                        }
                        String name = gameDetails.getName();
                        if (name == null) {
                            name = "";
                        }
                        gameMainActivity.H1().y1(name, null, new cb6());
                        db6 db6VarH1 = gameMainActivity.H1();
                        dlj dljVar = new dlj();
                        t46 t46Var = new t46();
                        t46Var.c = name;
                        t46Var.b = db6VarH1;
                        t46Var.e = dljVar;
                        FragmentManager supportFragmentManager = gameMainActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        elj eljVar = new elj();
                        flj fljVar = new flj();
                        t46Var.show(supportFragmentManager, "CampaignBottomSheetDialog");
                        t46Var.d = eljVar;
                        t46Var.f = fljVar;
                    }
                }
                return Unit.a;
            default:
                ((Function1) obj).invoke(new bri0.b0(kui0.d.a));
                return Unit.a;
        }
    }
}
