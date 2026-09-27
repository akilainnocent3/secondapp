package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f133900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f133901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f133902c;

    public j(String str, @Nullable String str2, int i10) {
        this.f133900a = str;
        this.f133901b = str2;
        this.f133902c = i10;
    }

    @NonNull
    public final String a() {
        return this.f133900a;
    }

    @Nullable
    public final String b() {
        return this.f133901b;
    }

    public final boolean c() {
        return d.a(this.f133901b);
    }

    public final int d() {
        return this.f133902c;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
