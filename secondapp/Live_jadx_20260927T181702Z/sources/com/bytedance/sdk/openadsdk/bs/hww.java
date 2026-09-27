package com.bytedance.sdk.openadsdk.bs;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.omn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements Comparable<hww> {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f35501hv;
    private long khx;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f35505sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final String f35506tq;
    private int vgm;
    private final ArrayList<Long> hww = new ArrayList<>();
    private final ArrayList<Long> vy = new ArrayList<>();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final ArrayList<Long> f35500hu = new ArrayList<>();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final ArrayList<Long> f35503ok = new ArrayList<>();

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final HashMap<String, tq> f35504rs = new HashMap<>();
    private int nod = 0;
    private int vhb = 0;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private final HashMap<String, tq> f35502ny = new HashMap<>();

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f35499ed = 0;
    private final ArrayList<String> weu = new ArrayList<>();

    public hww(String str) {
        this.f35506tq = str;
    }

    private void tq(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrNy = com.bytedance.sdk.openadsdk.hu.hww.hww().ny();
        if (iArrNy != null) {
            int i13 = 0;
            while (i13 < iArrNy.length) {
                int i14 = iArrNy[i13];
                long j10 = 60000;
                long j11 = jElapsedRealtime - (((long) i14) * 60000);
                Iterator<String> it = this.f35502ny.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    tq tqVar = this.f35502ny.get(next);
                    if (tqVar != null) {
                        long jHww = tqVar.hww(j11, jElapsedRealtime);
                        j12 += jHww;
                        if (jHww <= 0 && i13 == iArrNy.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    iArr = iArrNy;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14)))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrNy;
                }
                i13++;
                iArrNy = iArr;
            }
        }
        int[] iArrEd = com.bytedance.sdk.openadsdk.hu.hww.hww().ed();
        if (iArrEd != null) {
            int i15 = 0;
            while (i15 < iArrEd.length) {
                int i16 = iArrEd[i15];
                long j14 = jElapsedRealtime - (((long) i16) * 60000);
                long j15 = 0;
                int i17 = 0;
                for (String str : this.f35504rs.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    tq tqVar2 = this.f35504rs.get(str);
                    if (tqVar2 != null) {
                        long jHww2 = tqVar2.hww(j14, jElapsedRealtime);
                        j15 += jHww2;
                        if (jHww2 > 20000) {
                            i17++;
                        }
                        if (jHww2 <= 0 && i15 == iArrEd.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19)))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.f35502ny.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.f35504rs.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.hu.hww.hww().weu() && (i12 = this.nod) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.nod;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.hu.hww.hww().khx() && (i11 = this.f35499ed) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.f35499ed;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.hu.hww.hww().bs() || (i10 = this.vhb) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.vhb;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void hww(@NonNull String str, @Nullable String str2) {
        tq tqVar;
        tq tqVar2;
        tq tqVar3;
        tq tqVar4;
        tq tqVar5;
        tq tqVar6;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    b10 = 0;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    b10 = 1;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    b10 = 2;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    b10 = 3;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    b10 = 4;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    b10 = 5;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b10 = 6;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    b10 = 7;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    b10 = 8;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    b10 = 9;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    b10 = 10;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    b10 = c.f161635m;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    b10 = c.f161636n;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    b10 = 13;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    b10 = c.f161638p;
                }
                break;
        }
        switch (b10) {
            case 0:
                if (!TextUtils.isEmpty(str2) && (tqVar = this.f35502ny.get(str2)) != null) {
                    tqVar.vy(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 1:
                if (!TextUtils.isEmpty(str2) && (tqVar2 = this.f35502ny.get(str2)) != null) {
                    tqVar2.sd(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(str2) && this.f35502ny.get(str2) == null) {
                    tq tqVar7 = new tq();
                    this.f35502ny.put(str2, tqVar7);
                    tqVar7.hww(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 3:
            case 8:
            case 12:
            case 14:
                if (!TextUtils.isEmpty(str2) && (tqVar3 = this.f35504rs.get(str2)) != null && tqVar3.hww() != tq.f35508hv) {
                    tqVar3.tq(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.hu.hww.hww().weu()) {
                        this.nod = (int) (((long) this.nod) + tqVar3.hww(this.khx, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case 4:
                this.f35500hu.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.hu.hww.hww().ok()) {
                    this.vgm++;
                }
                if (!TextUtils.isEmpty(str2) && this.f35504rs.get(str2) == null) {
                    tq tqVar8 = new tq();
                    this.f35504rs.put(str2, tqVar8);
                    tqVar8.hww(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 5:
                this.hww.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.hu.hww.hww().hu()) {
                    this.f35505sd++;
                }
                break;
            case 6:
                if (!this.weu.contains(str2)) {
                    if (this.weu.size() > 50) {
                        this.weu.subList(0, 25).clear();
                    }
                    this.weu.add(str2);
                    this.vy.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.hu.hww.hww().vgm()) {
                        this.f35501hv++;
                    }
                    break;
                }
                break;
            case 7:
                if (!TextUtils.isEmpty(str2) && (tqVar4 = this.f35504rs.get(str2)) != null) {
                    tqVar4.vy(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 9:
                if (!TextUtils.isEmpty(str2) && (tqVar5 = this.f35504rs.get(str2)) != null) {
                    tqVar5.sd(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 10:
                if (!TextUtils.isEmpty(str2) && (tqVar6 = this.f35502ny.get(str2)) != null && tqVar6.hww() != tq.f35508hv) {
                    tqVar6.tq(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.hu.hww.hww().khx()) {
                        this.f35499ed = (int) (((long) this.f35499ed) + tqVar6.hww(this.khx, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case 11:
                if (com.bytedance.sdk.openadsdk.hu.hww.hww().bs()) {
                    this.vhb++;
                }
                break;
            case 13:
                this.f35503ok.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject hww(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            hww(jSONObject2, jSONObject);
            tq(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th2) {
            omn.vy(th2.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    public String tq() {
        return this.f35506tq;
    }

    private void hww(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void hww(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        hww("show_c_", jSONObject, this.hww, com.bytedance.sdk.openadsdk.hu.hww.hww().rs(), jElapsedRealtime, jSONObject2);
        hww("click_c_", jSONObject, this.vy, com.bytedance.sdk.openadsdk.hu.hww.hww().nod(), jElapsedRealtime, jSONObject2);
        hww("v_play_c_", jSONObject, this.f35500hu, com.bytedance.sdk.openadsdk.hu.hww.hww().vhb(), jElapsedRealtime, jSONObject2);
        hww("dislike_c_", jSONObject, this.f35503ok, com.bytedance.sdk.openadsdk.hu.hww.hww().wgt(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.hu.hww.hww().hu() && (i12 = this.f35505sd) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.f35505sd;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.hu.hww.hww().vgm() && (i11 = this.f35501hv) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.f35501hv;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.hu.hww.hww().ok() || (i10 = this.vgm) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.vgm;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void hww() {
        this.khx = SystemClock.elapsedRealtime();
        this.vhb = 0;
        this.f35501hv = 0;
        this.f35505sd = 0;
        this.f35499ed = 0;
        this.nod = 0;
        this.vgm = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(hww hwwVar) {
        return hwwVar.f35505sd - this.f35505sd;
    }
}
