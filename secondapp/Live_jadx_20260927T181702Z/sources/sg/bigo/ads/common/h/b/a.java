package sg.bigo.ads.common.h.b;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f133100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.common.h.a f133101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f133102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f133103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f133104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f133105f;

    public a(@NonNull sg.bigo.ads.common.h.a aVar) {
        this.f133101b = aVar;
        this.f133100a = aVar.f133057a;
    }

    public final void a(long j10) {
        this.f133101b.f133065i = j10;
    }

    public final void b(long j10) {
        this.f133101b.f133063g = j10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f133100a.equals(aVar.f133100a) && this.f133101b.f133060d.equals(aVar.f133101b.f133060d) && this.f133101b.f133059c.equals(aVar.f133101b.f133059c);
    }

    public String toString() {
        return this.f133101b.toString();
    }
}
