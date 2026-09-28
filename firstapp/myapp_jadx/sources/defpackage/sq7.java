package defpackage;

import android.view.View;
import com.sportybet.plugin.common.gift.GiftsActivity;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sq7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sq7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SHKeypadContainer sHKeypadContainer;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                uq7.a aVar = (uq7.a) obj;
                uq7.b bVar = aVar.a;
                if (bVar != null) {
                    bVar.a();
                }
                iu2.b();
                if (!iu2.m()) {
                    iu2.a.j().r0(k53.REAL);
                }
                aVar.dismiss();
                return;
            case 1:
                int i2 = GiftsActivity.P;
                ((GiftsActivity) obj).A1();
                return;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj;
                SHKeypadContainer sHKeypadContainer2 = overUnderComponent.U;
                if (sHKeypadContainer2 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                if (sHKeypadContainer2.getVisibility() == 0) {
                    SHKeypadContainer sHKeypadContainer3 = overUnderComponent.U;
                    if (sHKeypadContainer3 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer3.setVisibility(8);
                    try {
                        overUnderComponent.p();
                        overUnderComponent.t();
                        sHKeypadContainer = overUnderComponent.U;
                        if (sHKeypadContainer == null) {
                            Intrinsics.n("ouKeypad");
                            throw null;
                        }
                    } catch (Exception unused) {
                        overUnderComponent.t();
                        sHKeypadContainer = overUnderComponent.U;
                        if (sHKeypadContainer == null) {
                            Intrinsics.n("ouKeypad");
                            throw null;
                        }
                    } catch (Throwable th) {
                        overUnderComponent.t();
                        SHKeypadContainer sHKeypadContainer4 = overUnderComponent.U;
                        if (sHKeypadContainer4 == null) {
                            Intrinsics.n("ouKeypad");
                            throw null;
                        }
                        sHKeypadContainer4.setVisibility(8);
                        overUnderComponent.z = 0;
                        throw th;
                    }
                    sHKeypadContainer.setVisibility(8);
                    overUnderComponent.z = 0;
                    return;
                }
                return;
        }
    }
}
