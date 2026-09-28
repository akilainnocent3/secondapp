package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.globalpay.pix.PixBank;
import com.sporty.android.core.model.pocket.globalpay.pix.PixBankAccount;
import com.sporty.android.core.model.pocket.globalpay.pix.PixBankAssets;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class yak {
    public final sr10 a;
    public final d3k b;

    public yak(sr10 sr10Var, d3k d3kVar) {
        sr10Var.getClass();
        d3kVar.getClass();
        this.a = sr10Var;
        this.b = d3kVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:14:0x0034, B:43:0x00c3, B:44:0x00dc, B:46:0x00e2, B:48:0x010a, B:56:0x0119, B:62:0x0126, B:67:0x0131, B:69:0x0146, B:71:0x0152, B:73:0x0161, B:75:0x0166, B:19:0x0043, B:39:0x00b1, B:22:0x004c, B:28:0x006f, B:31:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:25:0x0059), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #0 {all -> 0x0169, blocks: (B:14:0x0034, B:43:0x00c3, B:44:0x00dc, B:46:0x00e2, B:48:0x010a, B:56:0x0119, B:62:0x0126, B:67:0x0131, B:69:0x0146, B:71:0x0152, B:73:0x0161, B:75:0x0166, B:19:0x0043, B:39:0x00b1, B:22:0x004c, B:28:0x006f, B:31:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:25:0x0059), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119 A[Catch: all -> 0x0169, TRY_ENTER, TryCatch #0 {all -> 0x0169, blocks: (B:14:0x0034, B:43:0x00c3, B:44:0x00dc, B:46:0x00e2, B:48:0x010a, B:56:0x0119, B:62:0x0126, B:67:0x0131, B:69:0x0146, B:71:0x0152, B:73:0x0161, B:75:0x0166, B:19:0x0043, B:39:0x00b1, B:22:0x004c, B:28:0x006f, B:31:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:25:0x0059), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:14:0x0034, B:43:0x00c3, B:44:0x00dc, B:46:0x00e2, B:48:0x010a, B:56:0x0119, B:62:0x0126, B:67:0x0131, B:69:0x0146, B:71:0x0152, B:73:0x0161, B:75:0x0166, B:19:0x0043, B:39:0x00b1, B:22:0x004c, B:28:0x006f, B:31:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:25:0x0059), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:14:0x0034, B:43:0x00c3, B:44:0x00dc, B:46:0x00e2, B:48:0x010a, B:56:0x0119, B:62:0x0126, B:67:0x0131, B:69:0x0146, B:71:0x0152, B:73:0x0161, B:75:0x0166, B:19:0x0043, B:39:0x00b1, B:22:0x004c, B:28:0x006f, B:31:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:25:0x0059), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0152 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:14:0x0034, B:43:0x00c3, B:44:0x00dc, B:46:0x00e2, B:48:0x010a, B:56:0x0119, B:62:0x0126, B:67:0x0131, B:69:0x0146, B:71:0x0152, B:73:0x0161, B:75:0x0166, B:19:0x0043, B:39:0x00b1, B:22:0x004c, B:28:0x006f, B:31:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:25:0x0059), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[SYNTHETIC] */
    public final Serializable a(boolean z, x1b x1bVar) {
        xak xakVar;
        boolean z2;
        Object objD;
        boolean z3;
        Map map;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i;
        Object obj;
        PixBank pixBank;
        String name;
        String str;
        String imageUrl;
        String str2;
        String imageUrlRound;
        String str3;
        yak yakVar = this;
        if (x1bVar instanceof xak) {
            xakVar = (xak) x1bVar;
            int i2 = xakVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xakVar.f = i2 - Integer.MIN_VALUE;
            } else {
                xakVar = new xak(yakVar, x1bVar);
            }
        } else {
            xakVar = new xak(yakVar, x1bVar);
        }
        Object objA = xakVar.d;
        y5b y5bVar = y5b.a;
        int i3 = xakVar.f;
        try {
            if (i3 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                xakVar.b = yakVar;
                z2 = z;
                xakVar.a = z2;
                xakVar.f = 1;
                objD = w5b.d(new wak(yakVar, null), xakVar);
                if (objD == y5bVar) {
                }
                return y5bVar;
            }
            if (i3 == 1) {
                boolean z4 = xakVar.a;
                yak yakVar2 = xakVar.b;
                uj50.b(objA);
                z2 = z4;
                yakVar = yakVar2;
                objD = objA;
            } else {
                if (i3 == 2) {
                    z3 = xakVar.a;
                    map = xakVar.c;
                    uj50.b(objA);
                    xakVar.b = null;
                    xakVar.c = map;
                    xakVar.a = z3;
                    xakVar.f = 3;
                    objA = s0i.a((lyh) objA, xakVar);
                    if (objA != y5bVar) {
                        map2 = map;
                    }
                    return y5bVar;
                }
                if (i3 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = xakVar.a;
                map2 = xakVar.c;
                uj50.b(objA);
            }
            List<PixBankAccount> pixBankAssets = ((PixBankAssets) n52.b((BaseResponse) objA)).getPixBankAssets();
            arrayList = new ArrayList(l48.r(pixBankAssets, 10));
            for (PixBankAccount pixBankAccount : pixBankAssets) {
                pixBank = (PixBank) map2.get(pixBankAccount.getIspb());
                hw1 hw1VarValueOf = hw1.valueOf(pixBankAccount.getStatus());
                String strValueOf = String.valueOf(pixBankAccount.getId());
                String ispb = pixBankAccount.getIspb();
                if (pixBank != null) {
                    name = pixBank.getName();
                } else {
                    name = null;
                }
                if (name == null) {
                    str = "";
                } else {
                    str = name;
                }
                if (pixBank != null) {
                    imageUrl = pixBank.getImageUrl();
                } else {
                    imageUrl = null;
                }
                if (imageUrl == null) {
                    str2 = "";
                } else {
                    str2 = imageUrl;
                }
                if (pixBank != null) {
                    imageUrlRound = pixBank.getImageUrlRound();
                } else {
                    imageUrlRound = null;
                }
                if (imageUrlRound == null) {
                    str3 = "";
                } else {
                    str3 = imageUrlRound;
                }
                arrayList.add(new p610(strValueOf, ispb, str, str2, str3, pixBankAccount.getBranch(), pixBankAccount.getAccountId(), pixBankAccount.getAccountType(), hw1VarValueOf));
            }
            if (z3) {
                arrayList2 = new ArrayList();
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    obj = arrayList.get(i);
                    i++;
                    if (((p610) obj).i == hw1.a) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
            Iterable iterable = (Iterable) objD;
            int iA = jpu.a(l48.r(iterable, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj2 : iterable) {
                linkedHashMap.put(((PixBank) obj2).getIspb(), obj2);
            }
            sr10 sr10Var = yakVar.a;
            xakVar.b = null;
            xakVar.c = linkedHashMap;
            xakVar.a = z2;
            xakVar.f = 2;
            lyh lyhVarN0 = sr10Var.n0();
            if (lyhVarN0 != y5bVar) {
                boolean z5 = z2;
                objA = lyhVarN0;
                z3 = z5;
                map = linkedHashMap;
                xakVar.b = null;
                xakVar.c = map;
                xakVar.a = z3;
                xakVar.f = 3;
                objA = s0i.a((lyh) objA, xakVar);
                if (objA != y5bVar) {
                    map2 = map;
                    List<PixBankAccount> pixBankAssets2 = ((PixBankAssets) n52.b((BaseResponse) objA)).getPixBankAssets();
                    arrayList = new ArrayList(l48.r(pixBankAssets2, 10));
                    while (r1.hasNext()) {
                        pixBank = (PixBank) map2.get(pixBankAccount.getIspb());
                        hw1 hw1VarValueOf2 = hw1.valueOf(pixBankAccount.getStatus());
                        String strValueOf2 = String.valueOf(pixBankAccount.getId());
                        String ispb2 = pixBankAccount.getIspb();
                        if (pixBank != null) {
                            name = pixBank.getName();
                        } else {
                            name = null;
                        }
                        if (name == null) {
                            str = "";
                        } else {
                            str = name;
                        }
                        if (pixBank != null) {
                            imageUrl = pixBank.getImageUrl();
                        } else {
                            imageUrl = null;
                        }
                        if (imageUrl == null) {
                            str2 = "";
                        } else {
                            str2 = imageUrl;
                        }
                        if (pixBank != null) {
                            imageUrlRound = pixBank.getImageUrlRound();
                        } else {
                            imageUrlRound = null;
                        }
                        if (imageUrlRound == null) {
                            str3 = "";
                        } else {
                            str3 = imageUrlRound;
                        }
                        arrayList.add(new p610(strValueOf2, ispb2, str, str2, str3, pixBankAccount.getBranch(), pixBankAccount.getAccountId(), pixBankAccount.getAccountType(), hw1VarValueOf2));
                    }
                    if (z3) {
                        arrayList2 = new ArrayList();
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            obj = arrayList.get(i);
                            i++;
                            if (((p610) obj).i == hw1.a) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    zi50.a aVar3 = zi50.b;
                    return arrayList;
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            return new zi50.b(th);
        }
    }
}
