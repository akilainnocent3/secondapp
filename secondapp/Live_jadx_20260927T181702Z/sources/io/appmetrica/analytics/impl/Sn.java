package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Sn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gn f96468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f96469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5116i6 f96470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cl f96471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ie f96472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Je f96473f;

    public Sn() {
        this(new Gn(), new W(new C5534yn()), new C5116i6(), new Cl(), new Ie(), new Je());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@NonNull Rn rn2) {
        W5 w10 = new W5();
        Hn hn2 = rn2.f96421a;
        if (hn2 != null) {
            w10.f96660a = this.f96468a.fromModel(hn2);
        }
        V v10 = rn2.f96422b;
        if (v10 != null) {
            w10.f96661b = this.f96469b.fromModel(v10);
        }
        List<El> list = rn2.f96423c;
        if (list != null) {
            w10.f96664e = this.f96471d.fromModel(list);
        }
        String str = rn2.f96427g;
        if (str != null) {
            w10.f96662c = str;
        }
        w10.f96663d = this.f96470c.a(rn2.f96428h);
        if (!TextUtils.isEmpty(rn2.f96424d)) {
            w10.f96667h = this.f96472e.fromModel(rn2.f96424d);
        }
        if (!TextUtils.isEmpty(rn2.f96425e)) {
            w10.f96668i = rn2.f96425e.getBytes();
        }
        if (!mo.a(rn2.f96426f)) {
            w10.f96669j = this.f96473f.fromModel(rn2.f96426f);
        }
        return w10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Sn(Gn gn2, W w10, C5116i6 c5116i6, Cl cl2, Ie ie2, Je je2) {
        this.f96469b = w10;
        this.f96468a = gn2;
        this.f96470c = c5116i6;
        this.f96471d = cl2;
        this.f96472e = ie2;
        this.f96473f = je2;
    }

    @NonNull
    public final Rn a(@NonNull W5 w10) {
        throw new UnsupportedOperationException();
    }
}
