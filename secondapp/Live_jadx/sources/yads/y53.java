package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y53 extends v21 {
    public static final Parcelable.Creator<y53> CREATOR = new x53();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158149d;

    public y53(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f158148c = parcel.readString();
        this.f158149d = (String) ib3.a((Object) parcel.readString());
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y53.class == obj.getClass()) {
            y53 y53Var = (y53) obj;
            if (ib3.a(this.f156721b, y53Var.f156721b) && ib3.a(this.f158148c, y53Var.f158148c) && ib3.a(this.f158149d, y53Var.f158149d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = k4.a(this.f156721b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f158148c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f158149d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": description=" + this.f158148c + ": value=" + this.f158149d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156721b);
        parcel.writeString(this.f158148c);
        parcel.writeString(this.f158149d);
    }

    public y53(String str, String str2, String str3) {
        super(str);
        this.f158148c = str2;
        this.f158149d = str3;
    }

    @Override // yads.v21, yads.ss1
    public final void a(im1 im1Var) {
        byte b10;
        String str = this.f156721b;
        str.getClass();
        switch (str) {
            case "TAL":
                b10 = 0;
                break;
            case "TCM":
                b10 = 1;
                break;
            case "TDA":
                b10 = 2;
                break;
            case "TP1":
                b10 = 3;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 5;
                break;
            case "TRK":
                b10 = 6;
                break;
            case "TT2":
                b10 = 7;
                break;
            case "TXT":
                b10 = 8;
                break;
            case "TYE":
                b10 = 9;
                break;
            case "TALB":
                b10 = 10;
                break;
            case "TCOM":
                b10 = zi.c.f161635m;
                break;
            case "TDAT":
                b10 = zi.c.f161636n;
                break;
            case "TDRC":
                b10 = 13;
                break;
            case "TDRL":
                b10 = zi.c.f161638p;
                break;
            case "TEXT":
                b10 = zi.c.f161639q;
                break;
            case "TIT2":
                b10 = zi.c.f161640r;
                break;
            case "TPE1":
                b10 = 17;
                break;
            case "TPE2":
                b10 = zi.c.f161643u;
                break;
            case "TPE3":
                b10 = 19;
                break;
            case "TRCK":
                b10 = zi.c.f161646x;
                break;
            case "TYER":
                b10 = zi.c.f161647y;
                break;
            default:
                b10 = -1;
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    im1Var.f150679c = this.f158149d;
                    break;
                case 1:
                case 11:
                    im1Var.f150700x = this.f158149d;
                    break;
                case 2:
                case 12:
                    int i10 = Integer.parseInt(this.f158149d.substring(2, 4));
                    int i11 = Integer.parseInt(this.f158149d.substring(0, 2));
                    im1Var.f150694r = Integer.valueOf(i10);
                    im1Var.f150695s = Integer.valueOf(i11);
                    break;
                case 3:
                case 17:
                    im1Var.f150678b = this.f158149d;
                    break;
                case 4:
                case 18:
                    im1Var.f150680d = this.f158149d;
                    break;
                case 5:
                case 19:
                    im1Var.f150701y = this.f158149d;
                    break;
                case 6:
                case 20:
                    String str2 = this.f158149d;
                    int i12 = ib3.f150516a;
                    String[] strArrSplit = str2.split(to.c.userBaseDel, -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    im1Var.f150689m = Integer.valueOf(i13);
                    im1Var.f150690n = numValueOf;
                    break;
                case 7:
                case 16:
                    im1Var.f150677a = this.f158149d;
                    break;
                case 8:
                case 15:
                    im1Var.f150699w = this.f158149d;
                    break;
                case 9:
                case 21:
                    im1Var.f150693q = Integer.valueOf(Integer.parseInt(this.f158149d));
                    break;
                case 13:
                    ArrayList arrayListA = a(this.f158149d);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                im1Var.f150695s = (Integer) arrayListA.get(2);
                            }
                        }
                        im1Var.f150694r = (Integer) arrayListA.get(1);
                    }
                    im1Var.f150693q = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a(this.f158149d);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                im1Var.f150698v = (Integer) arrayListA2.get(2);
                            }
                        }
                        im1Var.f150697u = (Integer) arrayListA2.get(1);
                    }
                    im1Var.f150696t = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
