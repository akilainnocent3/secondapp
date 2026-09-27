package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147057c;

    public b40(String str, String str2, String str3) {
        this.f147055a = str;
        this.f147056b = str2;
        this.f147057c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return kotlin.jvm.internal.m0.g(this.f147055a, b40Var.f147055a) && kotlin.jvm.internal.m0.g(this.f147056b, b40Var.f147056b) && kotlin.jvm.internal.m0.g(this.f147057c, b40Var.f147057c);
    }

    public final int hashCode() {
        String str = this.f147055a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f147056b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f147057c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.f147055a + ", appReviewStatus=" + this.f147056b + ", appAdsTxt=" + this.f147057c + gi.j.f86771d;
    }
}
