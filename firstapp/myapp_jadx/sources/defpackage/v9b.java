package defpackage;

import akj0.c;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.Picture;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.KycRejectBottomSheetActivity;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v9b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v9b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0136  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        Bitmap.Config config;
        int i = this.a;
        Object obj = this.b;
        Fragment fragmentG = null;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                e activity = fgbVar.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentG = supportFragmentManager.G(R.id.flContent);
                }
                if (!(fragmentG instanceof a)) {
                    ((x5a0) fgbVar.a1).setValue(Boolean.TRUE);
                }
                return Unit.a;
            case 1:
                ((ytw) obj).setValue(null);
                return Unit.a;
            case 2:
                qhk qhkVar = (qhk) obj;
                nbn nbnVar = qhkVar.a;
                u2z u2zVar = qhkVar.b;
                nbn nbnVarA = gzi.a(nbnVar, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(nbnVarA.source().I1());
                    vc1.a(nbnVarA, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        ib5.a("Failed to decode GIF.");
                        return null;
                    }
                    if (movieDecodeStream.isOpaque() && ((Boolean) q4h.b(u2zVar, abn.g)).booleanValue()) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = ze4.b(abn.c(u2zVar)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) q4h.b(u2zVar, abn.b);
                    }
                    c7w c7wVar = new c7w(movieDecodeStream, config, u2zVar.c);
                    p4h.b<Integer> bVar = van.a;
                    if (((Number) q4h.b(u2zVar, bVar)).intValue() != -2) {
                        int iIntValue = ((Number) q4h.b(u2zVar, bVar)).intValue();
                        if (iIntValue < -1) {
                            kb5.a(hce0.a(iIntValue, "Invalid repeatCount: "));
                            return null;
                        }
                        c7wVar.F = iIntValue;
                    }
                    Function0 function0 = (Function0) q4h.b(u2zVar, van.c);
                    Function0 function1 = (Function0) q4h.b(u2zVar, van.d);
                    if (function0 != null || function1 != null) {
                        c7wVar.e.add(new lsh0(function0, function1));
                    }
                    qg0 qg0Var = (qg0) q4h.b(u2zVar, van.b);
                    c7wVar.G = qg0Var;
                    if (qg0Var != null) {
                        Movie movie = c7wVar.a;
                        if (movie.width() <= 0 || movie.height() <= 0) {
                            c7wVar.H = null;
                            c7wVar.I = lg10.a;
                            c7wVar.J = false;
                        } else {
                            Picture picture = new Picture();
                            picture.beginRecording(movie.width(), movie.height());
                            c7wVar.I = qg0Var.a();
                            picture.endRecording();
                            c7wVar.H = picture;
                            c7wVar.J = true;
                        }
                    } else {
                        c7wVar.H = null;
                        c7wVar.I = lg10.a;
                        c7wVar.J = false;
                    }
                    c7wVar.invalidateSelf();
                    return new w4d(zbn.b(c7wVar), false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vc1.a(nbnVarA, th);
                        throw th2;
                    }
                }
            case 3:
                KycRejectBottomSheetActivity kycRejectBottomSheetActivity = (KycRejectBottomSheetActivity) obj;
                azm azmVar = kycRejectBottomSheetActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.CONTACT_US);
                kycRejectBottomSheetActivity.finish();
                return Unit.a;
            default:
                akj0 akj0Var = (akj0) obj;
                return e1i.e(new g1i(new wl50(new n1i(akj0Var.l0.X(pu0.b.a), bm50.d(akj0Var.u0), new akj0.b(3, null)), new xjj0()), akj0Var.new c(null)), o8i0.d(akj0Var), q490.a.a, lk50.b.a);
        }
    }
}
