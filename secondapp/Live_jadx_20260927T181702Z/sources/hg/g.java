package hg;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f88303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f88304o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f88305p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f88306q = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f88307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f88308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f88309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f88310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f88311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f88312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final n2 f88313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<n2> f88314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f88315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f88316m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Uri f88317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n2 f88318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f88320d;

        public a(@Nullable Uri uri, n2 n2Var, String str, String str2) {
            this.f88317a = uri;
            this.f88318b = n2Var;
            this.f88319c = str;
            this.f88320d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f88321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n2 f88322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f88323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f88324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f88325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f88326f;

        public b(Uri uri, n2 n2Var, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f88321a = uri;
            this.f88322b = n2Var;
            this.f88323c = str;
            this.f88324d = str2;
            this.f88325e = str3;
            this.f88326f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new n2.b().U("0").M("application/x-mpegURL").G(), null, null, null, null);
        }

        public b a(n2 n2Var) {
            return new b(this.f88321a, n2Var, this.f88323c, this.f88324d, this.f88325e, this.f88326f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f88303n = new g("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public g(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable n2 n2Var, @Nullable List<n2> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f88307d = Collections.unmodifiableList(e(list2, list3, list4, list5, list6));
        this.f88308e = Collections.unmodifiableList(list2);
        this.f88309f = Collections.unmodifiableList(list3);
        this.f88310g = Collections.unmodifiableList(list4);
        this.f88311h = Collections.unmodifiableList(list5);
        this.f88312i = Collections.unmodifiableList(list6);
        this.f88313j = n2Var;
        this.f88314k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f88315l = Collections.unmodifiableMap(map);
        this.f88316m = Collections.unmodifiableList(list8);
    }

    public static void a(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f88317a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> c(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                StreamKey streamKey = list2.get(i12);
                if (streamKey.f48601c == i10 && streamKey.f48602d == i11) {
                    arrayList.add(t10);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static g d(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new g("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    public static List<Uri> e(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f88321a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list2, arrayList);
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        return arrayList;
    }

    @Override // xf.z
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g copy(List<StreamKey> list) {
        String str = this.f88327a;
        List<String> list2 = this.f88328b;
        List listC = c(this.f88308e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new g(str, list2, listC, list3, c(this.f88310g, 1, list), c(this.f88311h, 2, list), list3, this.f88313j, this.f88314k, this.f88329c, this.f88315l, this.f88316m);
    }
}
