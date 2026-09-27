package m5;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class i extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f106394n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f106395o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f106396p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f106397q = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f106398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f106399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f106400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f106401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f106402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f106403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final androidx.media3.common.a f106404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<androidx.media3.common.a> f106405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f106406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f106407m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Uri f106408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f106409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f106411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f106412e;

        public a(@Nullable Uri uri, androidx.media3.common.a aVar, String str, String str2, @Nullable String str3) {
            this.f106408a = uri;
            this.f106409b = aVar;
            this.f106410c = str;
            this.f106411d = str2;
            this.f106412e = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f106413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f106414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f106415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f106416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f106417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f106418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f106419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f106420h;

        public b(Uri uri, androidx.media3.common.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.f106413a = uri;
            this.f106414b = aVar;
            this.f106415c = str;
            this.f106416d = str2;
            this.f106417e = str3;
            this.f106418f = str4;
            this.f106419g = str5;
            this.f106420h = str6;
        }

        public static b b(Uri uri) {
            return new b(uri, new androidx.media3.common.a.b().k0("0").X("application/x-mpegURL").Q(), null, null, null, null, null, null);
        }

        public b a(androidx.media3.common.a aVar) {
            return new b(this.f106413a, aVar, this.f106415c, this.f106416d, this.f106417e, this.f106418f, this.f106419g, this.f106420h);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f106394n = new i("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public i(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable androidx.media3.common.a aVar, @Nullable List<androidx.media3.common.a> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f106398d = Collections.unmodifiableList(e(list2, list3, list4, list5, list6));
        this.f106399e = Collections.unmodifiableList(list2);
        this.f106400f = Collections.unmodifiableList(list3);
        this.f106401g = Collections.unmodifiableList(list4);
        this.f106402h = Collections.unmodifiableList(list5);
        this.f106403i = Collections.unmodifiableList(list6);
        this.f106404j = aVar;
        this.f106405k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f106406l = Collections.unmodifiableMap(map);
        this.f106407m = Collections.unmodifiableList(list8);
    }

    public static void a(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f106408a;
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
                if (streamKey.f13599c == i10 && streamKey.f13600d == i11) {
                    arrayList.add(t10);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static i d(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new i("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    public static List<Uri> e(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f106413a;
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

    @Override // q5.z
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i copy(List<StreamKey> list) {
        String str = this.f106421a;
        List<String> list2 = this.f106422b;
        List listC = c(this.f106399e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new i(str, list2, listC, list3, c(this.f106401g, 1, list), c(this.f106402h, 2, list), list3, this.f106404j, this.f106405k, this.f106423c, this.f106406l, this.f106407m);
    }
}
