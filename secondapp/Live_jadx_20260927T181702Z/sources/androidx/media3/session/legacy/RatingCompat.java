package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;
import x4.d0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
@y0({y0.a.LIBRARY})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15885e = "Rating";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15886f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15887g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f15888h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f15889i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f15890j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f15891k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f15892l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f15893m = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Object f15896d;

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
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public RatingCompat(int i10, float f10) {
        this.f15894b = i10;
        this.f15895c = f10;
    }

    @Nullable
    @SuppressLint({"WrongConstant"})
    public static RatingCompat a(@Nullable Object obj) {
        RatingCompat ratingCompatO = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatO = k(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatO = n(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatO = m(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatO = l(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatO = o(ratingStyle);
            }
            ((RatingCompat) l0.E(ratingCompatO)).f15896d = obj;
        }
        return ratingCompatO;
    }

    public static RatingCompat k(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    @Nullable
    public static RatingCompat l(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        d0.d("Rating", "Invalid percentage-based rating value");
        return null;
    }

    @Nullable
    public static RatingCompat m(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                d0.d("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        d0.d("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat n(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    @Nullable
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
        if (this.f15894b == 6 && h()) {
            return this.f15895c;
        }
        return -1.0f;
    }

    @Nullable
    public Object d() {
        if (this.f15896d == null) {
            if (h()) {
                int i10 = this.f15894b;
                switch (i10) {
                    case 1:
                        this.f15896d = Rating.newHeartRating(g());
                        break;
                    case 2:
                        this.f15896d = Rating.newThumbRating(j());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f15896d = Rating.newStarRating(i10, f());
                        break;
                    case 6:
                        this.f15896d = Rating.newPercentageRating(c());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f15896d = Rating.newUnratedRating(this.f15894b);
            }
        }
        return this.f15896d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f15894b;
    }

    public int e() {
        return this.f15894b;
    }

    public float f() {
        int i10 = this.f15894b;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && h()) {
            return this.f15895c;
        }
        return -1.0f;
    }

    public boolean g() {
        return this.f15894b == 1 && this.f15895c == 1.0f;
    }

    public boolean h() {
        return this.f15895c >= 0.0f;
    }

    public boolean j() {
        return this.f15894b == 2 && this.f15895c == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f15894b);
        sb2.append(" rating=");
        float f10 = this.f15895c;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15894b);
        parcel.writeFloat(this.f15895c);
    }
}
