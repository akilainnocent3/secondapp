package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class rwg extends bo10 {
    public final int c;
    public final String d;
    public final int e;
    public final a f;
    public final int i;
    public final ekv.b v;
    public final boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    public rwg(int i, Exception exc, int i2, String str, int i3, a aVar, int i4, ekv.b bVar, boolean z) {
        String str2;
        int i5;
        a aVar2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            aVar2 = aVar;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            aVar2 = aVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            aVar2 = aVar;
            sb.append(aVar2);
            sb.append(", format_supported=");
            String str4 = jrh0.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    fm20.a();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, aVar2, i4, bVar, SystemClock.elapsedRealtime(), z);
    }

    public final rwg b(ekv.b bVar) {
        String message = getMessage();
        String str = jrh0.a;
        return new rwg(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.i, bVar, this.b, this.w);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwg(String str, Throwable th, int i, int i2, String str2, int i3, a aVar, int i4, ekv.b bVar, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        ly0.b(!z || i2 == 1);
        ly0.b(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = aVar;
        this.i = i4;
        this.v = bVar;
        this.w = z;
    }

    public rwg(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
