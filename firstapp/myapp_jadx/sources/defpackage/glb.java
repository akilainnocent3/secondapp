package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class glb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ glb(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) fragment;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = enbVar.Y;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[1], true);
                    }
                    GameDetails gameDetails = enbVar.G;
                    wz.a("Sound", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[1], false);
                    }
                    GameDetails gameDetails2 = enbVar.G;
                    wz.a("Sound", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                SharedPreferences.Editor editor2 = enbVar.Y;
                if (editor2 != null) {
                    editor2.apply();
                }
                enbVar.v0().K1(enbVar.v0().y1().d);
                return Unit.a;
            default:
                final fgg fggVar = (fgg) fragment;
                ((View) obj).getClass();
                fggVar.Q = true;
                if (fggVar.F0) {
                    fggVar.H0();
                }
                bo1 bo1Var = (bo1) fggVar.a;
                if (bo1Var != null) {
                    ej5.c(o8i0.d(bo1Var), null, null, new hm1(bo1Var, fggVar.h0, null), 3);
                }
                ypa0 ypa0VarD0 = fggVar.D0();
                String string = fggVar.getString(R.string.click_main_menu);
                string.getClass();
                ypa0VarD0.A1(0L, string);
                jhg jhgVar = (jhg) fggVar.b;
                if (jhgVar != null) {
                    fggVar.v0("sporty", jhgVar.A);
                }
                jhg jhgVar2 = (jhg) fggVar.b;
                if (jhgVar2 != null) {
                    jhgVar2.w.setRenderMode(1);
                }
                jhg jhgVar3 = (jhg) fggVar.b;
                if (jhgVar3 != null) {
                    jhgVar3.z.setRenderMode(1);
                }
                jhg jhgVar4 = (jhg) fggVar.b;
                if (jhgVar4 != null) {
                    jhgVar4.y.setRenderMode(1);
                }
                ppe ppeVar = fggVar.b0;
                if (ppeVar == null) {
                    Intrinsics.n("cubeRender1");
                    throw null;
                }
                edg edgVar = edg.i;
                ppeVar.i = edgVar;
                mpe mpeVar = fggVar.c0;
                if (mpeVar == null) {
                    Intrinsics.n("cubeRender2");
                    throw null;
                }
                mpeVar.i = edgVar;
                npe npeVar = fggVar.d0;
                if (npeVar == null) {
                    Intrinsics.n("cubeRender3");
                    throw null;
                }
                npeVar.i = edgVar;
                final int[] iArr = {R.drawable.flat_dice, R.drawable.flat_dice, R.drawable.sporty, R.drawable.sporty, R.drawable.flat_dice, R.drawable.flat_dice};
                final int[] iArr2 = {R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice, R.drawable.sporty};
                jhg jhgVar5 = (jhg) fggVar.b;
                if (jhgVar5 != null) {
                    jhgVar5.w.queueEvent(new Runnable() { // from class: heg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ppe ppeVar2 = fggVar.b0;
                            if (ppeVar2 != null) {
                                ppeVar2.a(iArr, iArr2, Float.valueOf(1.25f), Float.valueOf(0.8f));
                            }
                        }
                    });
                }
                jhg jhgVar6 = (jhg) fggVar.b;
                if (jhgVar6 != null) {
                    jhgVar6.y.queueEvent(new Runnable() { // from class: ieg
                        @Override // java.lang.Runnable
                        public final void run() {
                            mpe mpeVar2 = fggVar.c0;
                            if (mpeVar2 != null) {
                                mpeVar2.a(iArr, iArr2, Float.valueOf(1.25f), Float.valueOf(0.8f));
                            }
                        }
                    });
                }
                jhg jhgVar7 = (jhg) fggVar.b;
                if (jhgVar7 != null) {
                    jhgVar7.z.queueEvent(new Runnable() { // from class: jeg
                        @Override // java.lang.Runnable
                        public final void run() {
                            npe npeVar2 = fggVar.d0;
                            if (npeVar2 != null) {
                                npeVar2.a(iArr, iArr2, Float.valueOf(1.25f), Float.valueOf(0.8f));
                            }
                        }
                    });
                }
                jhg jhgVar8 = (jhg) fggVar.b;
                if (jhgVar8 != null) {
                    jhgVar8.E.setVisibility(8);
                }
                jhg jhgVar9 = (jhg) fggVar.b;
                if (jhgVar9 != null) {
                    jhgVar9.c.setVisibility(0);
                }
                jhg jhgVar10 = (jhg) fggVar.b;
                if (jhgVar10 != null) {
                    jhgVar10.i.setVisibility(0);
                }
                jhg jhgVar11 = (jhg) fggVar.b;
                if (jhgVar11 != null) {
                    jhgVar11.d.setVisibility(0);
                }
                jhg jhgVar12 = (jhg) fggVar.b;
                if (jhgVar12 != null) {
                    jhgVar12.H.setVisibility(0);
                }
                jhg jhgVar13 = (jhg) fggVar.b;
                if (jhgVar13 != null) {
                    jhgVar13.I.setVisibility(8);
                }
                jhg jhgVar14 = (jhg) fggVar.b;
                if (jhgVar14 != null) {
                    jhgVar14.F.setVisibility(4);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: keg
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgg fggVar2 = fggVar;
                        jhg jhgVar15 = (jhg) fggVar2.b;
                        if (jhgVar15 != null) {
                            jhgVar15.w.setRenderMode(0);
                        }
                        jhg jhgVar16 = (jhg) fggVar2.b;
                        if (jhgVar16 != null) {
                            jhgVar16.z.setRenderMode(0);
                        }
                        jhg jhgVar17 = (jhg) fggVar2.b;
                        if (jhgVar17 != null) {
                            jhgVar17.y.setRenderMode(0);
                        }
                    }
                }, 500L);
                return Unit.a;
        }
    }
}
