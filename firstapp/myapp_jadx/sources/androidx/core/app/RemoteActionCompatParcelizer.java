package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.n2i0;
import defpackage.p2i0;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(n2i0 n2i0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        p2i0 p2i0VarL = remoteActionCompat.a;
        if (n2i0Var.h(1)) {
            p2i0VarL = n2i0Var.l();
        }
        remoteActionCompat.a = (IconCompat) p2i0VarL;
        CharSequence charSequenceG = remoteActionCompat.b;
        if (n2i0Var.h(2)) {
            charSequenceG = n2i0Var.g();
        }
        remoteActionCompat.b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.c;
        if (n2i0Var.h(3)) {
            charSequenceG2 = n2i0Var.g();
        }
        remoteActionCompat.c = charSequenceG2;
        Parcelable parcelableJ = remoteActionCompat.d;
        if (n2i0Var.h(4)) {
            parcelableJ = n2i0Var.j();
        }
        remoteActionCompat.d = (PendingIntent) parcelableJ;
        boolean zE = remoteActionCompat.e;
        if (n2i0Var.h(5)) {
            zE = n2i0Var.e();
        }
        remoteActionCompat.e = zE;
        boolean zE2 = remoteActionCompat.f;
        if (n2i0Var.h(6)) {
            zE2 = n2i0Var.e();
        }
        remoteActionCompat.f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, n2i0 n2i0Var) {
        n2i0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        n2i0Var.m(1);
        n2i0Var.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        n2i0Var.m(2);
        n2i0Var.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        n2i0Var.m(3);
        n2i0Var.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        n2i0Var.m(4);
        n2i0Var.r(pendingIntent);
        boolean z = remoteActionCompat.e;
        n2i0Var.m(5);
        n2i0Var.n(z);
        boolean z2 = remoteActionCompat.f;
        n2i0Var.m(6);
        n2i0Var.n(z2);
    }
}
