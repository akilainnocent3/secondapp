package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.EventActivity;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.ResultWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class djg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ djg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj2;
                int i2 = EventActivity.U0;
                if (((Boolean) obj).booleanValue()) {
                    eventActivity.i2();
                }
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                Boolean bool = (Boolean) obj;
                int i3 = 1;
                if (!bool.booleanValue()) {
                    q1c0Var.p3();
                    q1c0Var.K0 = false;
                    q1c0Var.I0 = true;
                    foa0 foa0Var = (foa0) q1c0Var.a;
                    if (foa0Var != null) {
                        foa0Var.D.clear();
                        foa0Var.E.clear();
                    }
                    Context context = q1c0Var.getContext();
                    if (context != null) {
                        us80 us80Var = us80.d;
                        ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(-11, null);
                        s4v s4vVar = new s4v(q1c0Var, i3);
                        azb0 azb0Var = new azb0();
                        he8 he8Var = new he8(q1c0Var, 1);
                        context.getColor(R.color.sh_error_btn_color);
                        us80Var.c(context, genericError, s4vVar, azb0Var, he8Var, 0, (1024 & 128) != 0 ? new ita(1) : null, (1024 & 512) != 0 ? new pm60() : null, new qm60());
                    }
                }
                if (bool.booleanValue() && q1c0Var.I0) {
                    q1c0Var.K0 = false;
                    km60 km60Var = us80.d.a;
                    if (km60Var != null) {
                        km60Var.dismiss();
                    }
                    q1c0Var.G0();
                    q1c0Var.p2();
                    SharedPreferences sharedPreferences = q1c0Var.j0;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPORTY_HERO_MUSIC", true)) : null;
                    if (q1c0Var.V0) {
                        w3c0 w3c0Var = (w3c0) q1c0Var.b;
                        if (w3c0Var != null) {
                            ProgressMeterComponent progressMeterComponent = w3c0Var.d0;
                            ypa0 ypa0Var = q1c0Var.D;
                            if (ypa0Var == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            String string = q1c0Var.getString(R.string.bg_music_christmas);
                            string.getClass();
                            progressMeterComponent.K(ypa0Var, boolValueOf, string);
                        }
                    } else {
                        boolean z = q1c0Var.Y0;
                        B b = q1c0Var.b;
                        if (z) {
                            w3c0 w3c0Var2 = (w3c0) b;
                            if (w3c0Var2 != null) {
                                ProgressMeterComponent progressMeterComponent2 = w3c0Var2.d0;
                                ypa0 ypa0Var2 = q1c0Var.D;
                                if (ypa0Var2 == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                String string2 = q1c0Var.getString(R.string.bg_music_valentine);
                                string2.getClass();
                                progressMeterComponent2.K(ypa0Var2, boolValueOf, string2);
                            }
                        } else {
                            w3c0 w3c0Var3 = (w3c0) b;
                            if (w3c0Var3 != null) {
                                ProgressMeterComponent progressMeterComponent3 = w3c0Var3.d0;
                                ypa0 ypa0Var3 = q1c0Var.D;
                                if (ypa0Var3 == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                String string3 = q1c0Var.getString(R.string.revamp_bg_music);
                                string3.getClass();
                                progressMeterComponent3.K(ypa0Var3, boolValueOf, string3);
                            }
                        }
                    }
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new e3c0(q1c0Var, null), 3);
                }
                return Unit.a;
        }
    }
}
