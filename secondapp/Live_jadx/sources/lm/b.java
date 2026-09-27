package lm;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.a
@yi.b
public enum b {
    PRIVATE(':', fw.b.f85380g),
    REGISTRY(PublicSuffixDatabase.f119166e, '?');


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f104732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f104733c;

    b(char innerNodeCode, char leafNodeCode) {
        this.f104732b = innerNodeCode;
        this.f104733c = leafNodeCode;
    }

    public static b e(char code) {
        for (b bVar : values()) {
            if (bVar.g() == code || bVar.h() == code) {
                return bVar;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + code);
    }

    public char g() {
        return this.f104732b;
    }

    public char h() {
        return this.f104733c;
    }
}
