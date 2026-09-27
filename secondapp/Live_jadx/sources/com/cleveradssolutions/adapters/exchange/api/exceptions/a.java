package com.cleveradssolutions.adapters.exchange.api.exceptions;

import com.cleveradssolutions.adapters.exchange.rendering.video.vast.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42021c;

    /* JADX INFO: renamed from: com.cleveradssolutions.adapters.exchange.api.exceptions.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class C0421a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42022a;

        static {
            int[] iArr = new int[b.values().length];
            f42022a = iArr;
            try {
                iArr[b.DURATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42022a[b.VAST_UNSUPPORTED_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42022a[b.WRAPPER_LIMIT_REACH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42022a[b.NO_AD_IN_WRAPPER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42022a[b.MEDIA_NOT_FOUND_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42022a[b.NO_SUPPORTED_MEDIA_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42022a[b.SIZE_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a(b bVar) {
        int i10;
        this.f42020b = bVar.toString();
        switch (C0421a.f42022a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i10 = 204;
                break;
            case 7:
                i10 = 203;
                break;
            default:
                i10 = 200;
                break;
        }
        this.f42021c = i10;
    }

    public int d() {
        return this.f42021c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f42020b;
    }

    public a(String str) {
        this.f42020b = str;
        this.f42021c = 0;
    }

    public a(String str, int i10) {
        this.f42020b = str;
        this.f42021c = i10;
    }

    public a(String str, String str2) {
        this.f42020b = str + ": " + str2;
        this.f42021c = 0;
    }
}
