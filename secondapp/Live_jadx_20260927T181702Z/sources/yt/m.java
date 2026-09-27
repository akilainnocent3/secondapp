package yt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f159926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f159927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f159928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile q f159929d;

    public void a(q qVar) {
        if (this.f159929d != null) {
            return;
        }
        synchronized (this) {
            if (this.f159929d != null) {
                return;
            }
            try {
                if (this.f159926a != null) {
                    this.f159929d = qVar.getParserForType().b(this.f159926a, this.f159927b);
                } else {
                    this.f159929d = qVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f159928c ? this.f159929d.getSerializedSize() : this.f159926a.size();
    }

    public q c(q qVar) {
        a(qVar);
        return this.f159929d;
    }

    public q d(q qVar) {
        q qVar2 = this.f159929d;
        this.f159929d = qVar;
        this.f159926a = null;
        this.f159928c = true;
        return qVar2;
    }
}
