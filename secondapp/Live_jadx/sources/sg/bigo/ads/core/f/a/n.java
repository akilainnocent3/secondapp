package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f134854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f134856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f134857d;

    public n(@NonNull String str) {
        this.f134857d = false;
        this.f134854a = true;
        this.f134855b = str;
    }

    public String toString() {
        return "{\"Content\":\"" + this.f134855b + "\"}";
    }

    public n(@NonNull String str, byte b10) {
        this(str);
        this.f134857d = true;
    }
}
