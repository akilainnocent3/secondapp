package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C1376a> f134787a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C1376a> f134788b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.core.f.a.a$a, reason: collision with other inner class name */
    public static final class C1376a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f134789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f134790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f134791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f134792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f134793e;

        public C1376a(String str, int i10, int i11, @Nullable String str2, String str3) {
            this.f134790b = str;
            this.f134791c = i10;
            this.f134792d = i11;
            this.f134793e = str2;
            this.f134789a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.f134790b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.f134793e) || "image/png".equalsIgnoreCase(this.f134793e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.f134793e);
        }
    }

    @Nullable
    public final C1376a a() {
        return a(this.f134787a);
    }

    public static C1376a a(List<C1376a> list) {
        if (list == null) {
            return null;
        }
        for (C1376a c1376a : list) {
            if (c1376a != null) {
                return c1376a;
            }
        }
        return null;
    }
}
