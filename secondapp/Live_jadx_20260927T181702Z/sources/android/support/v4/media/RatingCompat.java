package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.t;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5708e = "Rating";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5709f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f5710g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f5711h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f5712i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f5713j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f5714k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f5715l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f5716m = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5719d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public static class b {
        @t
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        @t
        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        @t
        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        @t
        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        @t
        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        @t
        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        @t
        public static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        @t
        public static Rating h(float f10) {
            return Rating.newPercentageRating(f10);
        }

        @t
        public static Rating i(int i10, float f10) {
            return Rating.newStarRating(i10, f10);
        }

        @t
        public static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        @t
        public static Rating k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface d {
    }

    public RatingCompat(int i10, float f10) {
        this.f5717b = i10;
        this.f5718c = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompatO = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iB = b.b(rating);
            if (b.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompatO = k(b.d(rating));
                        break;
                    case 2:
                        ratingCompatO = n(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatO = m(iB, b.c(rating));
                        break;
                    case 6:
                        ratingCompatO = l(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatO = o(iB);
            }
            ratingCompatO.f5719d = obj;
        }
        return ratingCompatO;
    }

    public static RatingCompat k(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat l(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat m(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat n(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat o(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    public float c() {
        if (this.f5717b == 6 && h()) {
            return this.f5718c;
        }
        return -1.0f;
    }

    public Object d() {
        if (this.f5719d == null) {
            if (h()) {
                int i10 = this.f5717b;
                switch (i10) {
                    case 1:
                        this.f5719d = b.g(g());
                        break;
                    case 2:
                        this.f5719d = b.j(j());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f5719d = b.i(i10, f());
                        break;
                    case 6:
                        this.f5719d = b.h(c());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f5719d = b.k(this.f5717b);
            }
        }
        return this.f5719d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f5717b;
    }

    public int e() {
        return this.f5717b;
    }

    public float f() {
        int i10 = this.f5717b;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && h()) {
            return this.f5718c;
        }
        return -1.0f;
    }

    public boolean g() {
        return this.f5717b == 1 && this.f5718c == 1.0f;
    }

    public boolean h() {
        return this.f5718c >= 0.0f;
    }

    public boolean j() {
        return this.f5717b == 2 && this.f5718c == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f5717b);
        sb2.append(" rating=");
        float f10 = this.f5718c;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5717b);
        parcel.writeFloat(this.f5718c);
    }
}
