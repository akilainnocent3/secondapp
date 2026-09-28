package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hef0 {
    public static final hef0 a = new hef0();

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, String> {
        public final /* synthetic */ TextClassification a;

        public a(TextClassification textClassification) {
            this.a = textClassification;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(950061013);
            String strValueOf = String.valueOf(this.a.getLabel());
            aVar2.H();
            return strValueOf;
        }
    }

    public static final class b implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Drawable a;

        public b(Drawable drawable) {
            this.a = drawable;
        }

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                hef0.a.a(this.a, aVar2, 48);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.a, Integer, String> {
        public final /* synthetic */ RemoteAction a;

        public c(RemoteAction remoteAction) {
            this.a = remoteAction;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(-1376593684);
            String string = this.a.getTitle().toString();
            aVar2.H();
            return string;
        }
    }

    public static final class d implements gaj<j58, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ RemoteAction a;

        public d(RemoteAction remoteAction) {
            this.a = remoteAction;
        }

        @Override // defpackage.gaj
        public final Unit invoke(j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                hef0.a.b(this.a.getIcon(), aVar2, 48);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static void c(a1b a1bVar, final Context context, uef0 uef0Var) {
        if (context == null) {
            return;
        }
        int i = uef0Var.c;
        final TextClassification textClassification = uef0Var.b;
        if (i < 0) {
            a aVar = new a(textClassification);
            Drawable icon = textClassification.getIcon();
            a1b.b(a1bVar, aVar, icon != null ? new op8(-1123224187, new b(icon), true) : null, new Function0() { // from class: gef0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    tdf0.a(context, textClassification);
                    return Unit.a;
                }
            }, 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            a1b.b(a1bVar, new c(remoteAction), ((i == 0) || remoteAction.shouldShowIcon()) ? new op8(-1261173016, new d(remoteAction), true) : null, new gg2(remoteAction, 1), 6);
        }
    }

    public static final Unit d(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            sdf0.a(actionIntent);
        } else {
            actionIntent.send();
        }
        return Unit.a;
    }

    public final void a(Drawable drawable, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(257732500);
        int i2 = (bVarI.A(drawable) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d dVarR = j.r(androidx.compose.ui.d.a.b, b1b.e);
            boolean zA = bVarI.A(drawable);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new r6z(drawable, 1);
                bVarI.r(objY);
            }
            g75.a(androidx.compose.ui.draw.a.a(dVarR, (Function1) objY), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new i030(this, drawable, i);
        }
    }

    public final void b(Icon icon, androidx.compose.runtime.a aVar, int i) {
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> qfbVar;
        androidx.compose.runtime.b bVarI = aVar.i(2116504409);
        int i2 = (bVarI.A(icon) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zM = bVarI.M(icon) | bVarI.M(context);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = icon.loadDrawable(context);
                bVarI.r(objY);
            }
            Drawable drawable = (Drawable) objY;
            if (drawable == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    qfbVar = new osk(this, icon, i);
                }
            } else {
                a(drawable, bVarI, 48);
            }
            eVarZ.d = qfbVar;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            qfbVar = new qfb(this, icon, i);
            eVarZ.d = qfbVar;
        }
    }
}
