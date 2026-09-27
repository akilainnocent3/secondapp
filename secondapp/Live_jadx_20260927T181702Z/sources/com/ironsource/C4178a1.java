package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C4178a1 implements Parcelable {
    public static final Parcelable.Creator<C4178a1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f60510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f60511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f60512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<String> f60513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f60514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f60515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f60516l;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<C4178a1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4178a1 createFromParcel(Parcel parcel) {
            return new C4178a1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4178a1[] newArray(int i10) {
            return new C4178a1[i10];
        }
    }

    private void i() {
        this.f60508d = false;
        this.f60509e = -1;
        this.f60510f = new ArrayList<>();
        this.f60511g = new ArrayList<>();
        this.f60512h = new ArrayList<>();
        this.f60513i = new ArrayList<>();
        this.f60515k = "";
        this.f60514j = "";
        this.f60516l = new HashMap();
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f60511g.remove(str);
        } else if (this.f60511g.indexOf(str) == -1) {
            this.f60511g.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f60511g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f60513i.indexOf(str) > -1;
    }

    public String d() {
        return this.f60514j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f60516l;
    }

    public String f() {
        return this.f60515k;
    }

    public void g(String str) {
        this.f60514j = str;
    }

    public void h(String str) {
        this.f60515k = str;
    }

    public boolean j() {
        return this.f60508d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f60508d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f60509e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f60510f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f60511g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f60514j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f60515k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f60516l);
            sb2.append(", ");
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f60508d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f60509e);
            parcel.writeString(this.f60505a);
            parcel.writeString(this.f60506b);
            parcel.writeString(this.f60507c);
            parcel.writeString(this.f60514j);
            parcel.writeString(this.f60515k);
            parcel.writeString(new JSONObject(this.f60516l).toString());
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
        }
    }

    public C4178a1() {
        i();
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f60510f.indexOf(str) > -1;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f60512h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f60507c = str;
    }

    public String g() {
        return this.f60505a;
    }

    public String h() {
        return this.f60506b;
    }

    public void j(String str) {
        this.f60506b = str;
    }

    public String b() {
        return this.f60507c;
    }

    public int c() {
        return this.f60509e;
    }

    private C4178a1(Parcel parcel) {
        i();
        try {
            this.f60508d = parcel.readByte() != 0;
            this.f60509e = parcel.readInt();
            this.f60505a = parcel.readString();
            this.f60506b = parcel.readString();
            this.f60507c = parcel.readString();
            this.f60514j = parcel.readString();
            this.f60515k = parcel.readString();
            this.f60516l = a(parcel.readString());
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            i();
        }
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f60513i.indexOf(str) == -1) {
                this.f60513i.add(str);
                return;
            }
            return;
        }
        this.f60513i.remove(str);
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f60510f.indexOf(str) == -1) {
                this.f60510f.add(str);
                return;
            }
            return;
        }
        this.f60510f.remove(str);
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f60512h.indexOf(str) == -1) {
                this.f60512h.add(str);
                return;
            }
            return;
        }
        this.f60512h.remove(str);
    }

    public void a(Map<String, String> map) {
        this.f60516l = map;
    }

    public void a(boolean z10) {
        this.f60508d = z10;
    }

    public void a(int i10) {
        this.f60509e = i10;
    }

    public void a() {
        this.f60509e = -1;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
        return map;
    }

    public void i(String str) {
        this.f60505a = str;
    }
}
