package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.remote.models.DetailResponseData;
import com.sportygames.sportyherov2.remote.models.FetchUnderResponse;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class omz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ omz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tu80 binding;
        ru80 binding2;
        tu80 binding3;
        ru80 binding4;
        tu80 binding5;
        ru80 binding6;
        tu80 binding7;
        ru80 binding8;
        tu80 binding9;
        ru80 binding10;
        tu80 binding11;
        ru80 binding12;
        tu80 binding13;
        ru80 binding14;
        tu80 binding15;
        ru80 binding16;
        tu80 binding17;
        ru80 binding18;
        tu80 binding19;
        ru80 binding20;
        tu80 binding21;
        ru80 binding22;
        tu80 binding23;
        ru80 binding24;
        tu80 binding25;
        ru80 binding26;
        tu80 binding27;
        ru80 binding28;
        tu80 binding29;
        ru80 binding30;
        tu80 binding31;
        ru80 binding32;
        tu80 binding33;
        ru80 binding34;
        tu80 binding35;
        ru80 binding36;
        tu80 binding37;
        ru80 binding38;
        tu80 binding39;
        ru80 binding40;
        tu80 binding41;
        tu80 binding42;
        tu80 binding43;
        tu80 binding44;
        tu80 binding45;
        FetchUnderResponse fetchUnderResponse;
        tu80 binding46;
        HashMap<Double, Double> underFetchDetail;
        tu80 binding47;
        FetchUnderResponse fetchUnderResponse2;
        tu80 binding48;
        HashMap<Double, Double> underFetchDetail2;
        tu80 binding49;
        ru80 binding50;
        tu80 binding51;
        ru80 binding52;
        tu80 binding53;
        ru80 binding54;
        tu80 binding55;
        ru80 binding56;
        tu80 binding57;
        ru80 binding58;
        tu80 binding59;
        ru80 binding60;
        tu80 binding61;
        ru80 binding62;
        tu80 binding63;
        ru80 binding64;
        tu80 binding65;
        ru80 binding66;
        tu80 binding67;
        ru80 binding68;
        tu80 binding69;
        ru80 binding70;
        tu80 binding71;
        ru80 binding72;
        tu80 binding73;
        ru80 binding74;
        tu80 binding75;
        ru80 binding76;
        tu80 binding77;
        ru80 binding78;
        tu80 binding79;
        ru80 binding80;
        tu80 binding81;
        ru80 binding82;
        tu80 binding83;
        ru80 binding84;
        tu80 binding85;
        ru80 binding86;
        tu80 binding87;
        ru80 binding88;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                knn knnVar = (knn) obj;
                knnVar.getClass();
                knnVar.a.b((tmz) obj2, "paddingValues");
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = q1c0.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    q1c0Var.G1 = false;
                    w3c0 w3c0Var = (w3c0) q1c0Var.b;
                    if (w3c0Var != null && (binding48 = w3c0Var.a0.getBinding()) != null && (underFetchDetail2 = binding48.b.getUnderFetchDetail()) != null) {
                        underFetchDetail2.clear();
                    }
                    w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                    if (w3c0Var2 != null && (binding47 = w3c0Var2.a0.getBinding()) != null) {
                        OverUnderComponent overUnderComponent = binding47.b;
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        overUnderComponent.setUnderFetchDetail((hTTPResponse == null || (fetchUnderResponse2 = (FetchUnderResponse) hTTPResponse.getData()) == null) ? null : fetchUnderResponse2.getData());
                    }
                    w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                    if (w3c0Var3 != null && (binding46 = w3c0Var3.a0.getBinding()) != null && (underFetchDetail = binding46.c.getUnderFetchDetail()) != null) {
                        underFetchDetail.clear();
                    }
                    w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                    if (w3c0Var4 != null && (binding45 = w3c0Var4.a0.getBinding()) != null) {
                        OverUnderComponent overUnderComponent2 = binding45.c;
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        overUnderComponent2.setUnderFetchDetail((hTTPResponse2 == null || (fetchUnderResponse = (FetchUnderResponse) hTTPResponse2.getData()) == null) ? null : fetchUnderResponse.getData());
                    }
                    DetailResponseData detailResponseData = q1c0Var.F;
                    if (detailResponseData == null) {
                        Intrinsics.n("detailCompleteResponse");
                        throw null;
                    }
                    if (!detailResponseData.getSideBetConfigs().isEmpty()) {
                        w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                        if (w3c0Var5 != null && (binding44 = w3c0Var5.a0.getBinding()) != null) {
                            OverUnderComponent overUnderComponent3 = binding44.b;
                            DetailResponseData detailResponseData2 = q1c0Var.F;
                            if (detailResponseData2 == null) {
                                Intrinsics.n("detailCompleteResponse");
                                throw null;
                            }
                            overUnderComponent3.setMinThreshold(detailResponseData2.getOuMinFBGUsageThreshold());
                        }
                        w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                        if (w3c0Var6 != null && (binding43 = w3c0Var6.a0.getBinding()) != null) {
                            OverUnderComponent overUnderComponent4 = binding43.c;
                            DetailResponseData detailResponseData3 = q1c0Var.F;
                            if (detailResponseData3 == null) {
                                Intrinsics.n("detailCompleteResponse");
                                throw null;
                            }
                            overUnderComponent4.setMinThreshold(detailResponseData3.getOuMinFBGUsageThreshold());
                        }
                        w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                        if (w3c0Var7 != null && (binding42 = w3c0Var7.a0.getBinding()) != null) {
                            OverUnderComponent overUnderComponent5 = binding42.b;
                            DetailResponseData detailResponseData4 = q1c0Var.F;
                            if (detailResponseData4 == null) {
                                Intrinsics.n("detailCompleteResponse");
                                throw null;
                            }
                            List<SideBetConfigsList> sideBetConfigs = detailResponseData4.getSideBetConfigs();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : sideBetConfigs) {
                                if (Intrinsics.g(((SideBetConfigsList) obj3).getSideBetType(), "OVER_UNDER")) {
                                    arrayList.add(obj3);
                                }
                            }
                            SideBetConfigsList sideBetConfigsList = (SideBetConfigsList) arrayList.get(0);
                            DetailResponseData detailResponseData5 = q1c0Var.F;
                            if (detailResponseData5 == null) {
                                Intrinsics.n("detailCompleteResponse");
                                throw null;
                            }
                            overUnderComponent5.setCoeffModel(sideBetConfigsList, detailResponseData5.getOuMinFBGUsageThreshold());
                        }
                        w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                        if (w3c0Var8 != null && (binding41 = w3c0Var8.a0.getBinding()) != null) {
                            OverUnderComponent overUnderComponent6 = binding41.c;
                            DetailResponseData detailResponseData6 = q1c0Var.F;
                            if (detailResponseData6 == null) {
                                Intrinsics.n("detailCompleteResponse");
                                throw null;
                            }
                            List<SideBetConfigsList> sideBetConfigs2 = detailResponseData6.getSideBetConfigs();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : sideBetConfigs2) {
                                if (Intrinsics.g(((SideBetConfigsList) obj4).getSideBetType(), "OVER_UNDER")) {
                                    arrayList2.add(obj4);
                                }
                            }
                            SideBetConfigsList sideBetConfigsList2 = (SideBetConfigsList) arrayList2.get(0);
                            DetailResponseData detailResponseData7 = q1c0Var.F;
                            if (detailResponseData7 == null) {
                                Intrinsics.n("detailCompleteResponse");
                                throw null;
                            }
                            overUnderComponent6.setCoeffModel(sideBetConfigsList2, detailResponseData7.getOuMinFBGUsageThreshold());
                        }
                    }
                    q1c0Var.D1();
                    w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                    if (w3c0Var9 != null && (binding39 = w3c0Var9.a0.getBinding()) != null && (binding40 = binding39.b.getBinding()) != null) {
                        binding40.o0.F();
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding37 = w3c0Var10.a0.getBinding()) != null && (binding38 = binding37.b.getBinding()) != null) {
                        binding38.p0.F();
                    }
                    w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                    if (w3c0Var11 != null && (binding35 = w3c0Var11.a0.getBinding()) != null && (binding36 = binding35.c.getBinding()) != null) {
                        binding36.o0.F();
                    }
                    w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                    if (w3c0Var12 != null && (binding33 = w3c0Var12.a0.getBinding()) != null && (binding34 = binding33.c.getBinding()) != null) {
                        binding34.p0.F();
                    }
                    w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                    if (w3c0Var13 != null && (binding31 = w3c0Var13.a0.getBinding()) != null && (binding32 = binding31.b.getBinding()) != null) {
                        binding32.q0.F();
                    }
                    w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                    if (w3c0Var14 != null && (binding29 = w3c0Var14.a0.getBinding()) != null && (binding30 = binding29.b.getBinding()) != null) {
                        binding30.r0.F();
                    }
                    w3c0 w3c0Var15 = (w3c0) q1c0Var.b;
                    if (w3c0Var15 != null && (binding27 = w3c0Var15.a0.getBinding()) != null && (binding28 = binding27.c.getBinding()) != null) {
                        binding28.q0.F();
                    }
                    w3c0 w3c0Var16 = (w3c0) q1c0Var.b;
                    if (w3c0Var16 != null && (binding25 = w3c0Var16.a0.getBinding()) != null && (binding26 = binding25.c.getBinding()) != null) {
                        binding26.r0.F();
                    }
                    w3c0 w3c0Var17 = (w3c0) q1c0Var.b;
                    if (w3c0Var17 != null && (binding23 = w3c0Var17.a0.getBinding()) != null && (binding24 = binding23.c.getBinding()) != null) {
                        binding24.d0.setVisibility(8);
                    }
                    w3c0 w3c0Var18 = (w3c0) q1c0Var.b;
                    if (w3c0Var18 != null && (binding21 = w3c0Var18.a0.getBinding()) != null && (binding22 = binding21.b.getBinding()) != null) {
                        binding22.d0.setVisibility(8);
                    }
                    w3c0 w3c0Var19 = (w3c0) q1c0Var.b;
                    if (w3c0Var19 != null && (binding19 = w3c0Var19.a0.getBinding()) != null && (binding20 = binding19.c.getBinding()) != null) {
                        binding20.Z.setVisibility(4);
                    }
                    w3c0 w3c0Var20 = (w3c0) q1c0Var.b;
                    if (w3c0Var20 != null && (binding17 = w3c0Var20.a0.getBinding()) != null && (binding18 = binding17.b.getBinding()) != null) {
                        binding18.Z.setVisibility(4);
                    }
                    w3c0 w3c0Var21 = (w3c0) q1c0Var.b;
                    if (w3c0Var21 != null && (binding15 = w3c0Var21.a0.getBinding()) != null && (binding16 = binding15.c.getBinding()) != null) {
                        binding16.a0.setVisibility(0);
                    }
                    w3c0 w3c0Var22 = (w3c0) q1c0Var.b;
                    if (w3c0Var22 != null && (binding13 = w3c0Var22.a0.getBinding()) != null && (binding14 = binding13.b.getBinding()) != null) {
                        binding14.a0.setVisibility(0);
                    }
                    w3c0 w3c0Var23 = (w3c0) q1c0Var.b;
                    if (w3c0Var23 != null && (binding11 = w3c0Var23.a0.getBinding()) != null && (binding12 = binding11.b.getBinding()) != null) {
                        binding12.Y.setVisibility(0);
                    }
                    w3c0 w3c0Var24 = (w3c0) q1c0Var.b;
                    if (w3c0Var24 != null && (binding9 = w3c0Var24.a0.getBinding()) != null && (binding10 = binding9.c.getBinding()) != null) {
                        binding10.Y.setVisibility(0);
                    }
                    w3c0 w3c0Var25 = (w3c0) q1c0Var.b;
                    if (w3c0Var25 != null && (binding7 = w3c0Var25.a0.getBinding()) != null && (binding8 = binding7.b.getBinding()) != null) {
                        binding8.b0.setVisibility(0);
                    }
                    w3c0 w3c0Var26 = (w3c0) q1c0Var.b;
                    if (w3c0Var26 != null && (binding5 = w3c0Var26.a0.getBinding()) != null && (binding6 = binding5.c.getBinding()) != null) {
                        binding6.b0.setVisibility(0);
                    }
                    w3c0 w3c0Var27 = (w3c0) q1c0Var.b;
                    if (w3c0Var27 != null && (binding3 = w3c0Var27.a0.getBinding()) != null && (binding4 = binding3.b.getBinding()) != null) {
                        binding4.c0.setVisibility(8);
                    }
                    w3c0 w3c0Var28 = (w3c0) q1c0Var.b;
                    if (w3c0Var28 != null && (binding = w3c0Var28.a0.getBinding()) != null && (binding2 = binding.c.getBinding()) != null) {
                        binding2.c0.setVisibility(8);
                    }
                } else if (i2 == 2) {
                    q1c0Var.G1 = true;
                    q1c0Var.g3();
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    q1c0Var.D1();
                    w3c0 w3c0Var29 = (w3c0) q1c0Var.b;
                    if (w3c0Var29 != null && (binding87 = w3c0Var29.a0.getBinding()) != null && (binding88 = binding87.b.getBinding()) != null) {
                        binding88.o0.E();
                    }
                    w3c0 w3c0Var30 = (w3c0) q1c0Var.b;
                    if (w3c0Var30 != null && (binding85 = w3c0Var30.a0.getBinding()) != null && (binding86 = binding85.b.getBinding()) != null) {
                        binding86.p0.E();
                    }
                    w3c0 w3c0Var31 = (w3c0) q1c0Var.b;
                    if (w3c0Var31 != null && (binding83 = w3c0Var31.a0.getBinding()) != null && (binding84 = binding83.c.getBinding()) != null) {
                        binding84.o0.E();
                    }
                    w3c0 w3c0Var32 = (w3c0) q1c0Var.b;
                    if (w3c0Var32 != null && (binding81 = w3c0Var32.a0.getBinding()) != null && (binding82 = binding81.c.getBinding()) != null) {
                        binding82.p0.E();
                    }
                    w3c0 w3c0Var33 = (w3c0) q1c0Var.b;
                    if (w3c0Var33 != null && (binding79 = w3c0Var33.a0.getBinding()) != null && (binding80 = binding79.b.getBinding()) != null) {
                        binding80.q0.E();
                    }
                    w3c0 w3c0Var34 = (w3c0) q1c0Var.b;
                    if (w3c0Var34 != null && (binding77 = w3c0Var34.a0.getBinding()) != null && (binding78 = binding77.b.getBinding()) != null) {
                        binding78.r0.E();
                    }
                    w3c0 w3c0Var35 = (w3c0) q1c0Var.b;
                    if (w3c0Var35 != null && (binding75 = w3c0Var35.a0.getBinding()) != null && (binding76 = binding75.c.getBinding()) != null) {
                        binding76.q0.E();
                    }
                    w3c0 w3c0Var36 = (w3c0) q1c0Var.b;
                    if (w3c0Var36 != null && (binding73 = w3c0Var36.a0.getBinding()) != null && (binding74 = binding73.c.getBinding()) != null) {
                        binding74.r0.E();
                    }
                    w3c0 w3c0Var37 = (w3c0) q1c0Var.b;
                    if (w3c0Var37 != null && (binding71 = w3c0Var37.a0.getBinding()) != null && (binding72 = binding71.c.getBinding()) != null) {
                        binding72.d0.setVisibility(0);
                    }
                    w3c0 w3c0Var38 = (w3c0) q1c0Var.b;
                    if (w3c0Var38 != null && (binding69 = w3c0Var38.a0.getBinding()) != null && (binding70 = binding69.b.getBinding()) != null) {
                        binding70.d0.setVisibility(0);
                    }
                    w3c0 w3c0Var39 = (w3c0) q1c0Var.b;
                    if (w3c0Var39 != null && (binding67 = w3c0Var39.a0.getBinding()) != null && (binding68 = binding67.b.getBinding()) != null) {
                        binding68.c0.setVisibility(0);
                    }
                    w3c0 w3c0Var40 = (w3c0) q1c0Var.b;
                    if (w3c0Var40 != null && (binding65 = w3c0Var40.a0.getBinding()) != null && (binding66 = binding65.c.getBinding()) != null) {
                        binding66.c0.setVisibility(0);
                    }
                    w3c0 w3c0Var41 = (w3c0) q1c0Var.b;
                    if (w3c0Var41 != null && (binding63 = w3c0Var41.a0.getBinding()) != null && (binding64 = binding63.c.getBinding()) != null) {
                        binding64.Z.setVisibility(0);
                    }
                    w3c0 w3c0Var42 = (w3c0) q1c0Var.b;
                    if (w3c0Var42 != null && (binding61 = w3c0Var42.a0.getBinding()) != null && (binding62 = binding61.b.getBinding()) != null) {
                        binding62.Z.setVisibility(0);
                    }
                    w3c0 w3c0Var43 = (w3c0) q1c0Var.b;
                    if (w3c0Var43 != null && (binding59 = w3c0Var43.a0.getBinding()) != null && (binding60 = binding59.c.getBinding()) != null) {
                        binding60.a0.setVisibility(4);
                    }
                    w3c0 w3c0Var44 = (w3c0) q1c0Var.b;
                    if (w3c0Var44 != null && (binding57 = w3c0Var44.a0.getBinding()) != null && (binding58 = binding57.b.getBinding()) != null) {
                        binding58.a0.setVisibility(4);
                    }
                    w3c0 w3c0Var45 = (w3c0) q1c0Var.b;
                    if (w3c0Var45 != null && (binding55 = w3c0Var45.a0.getBinding()) != null && (binding56 = binding55.b.getBinding()) != null) {
                        binding56.Y.setVisibility(4);
                    }
                    w3c0 w3c0Var46 = (w3c0) q1c0Var.b;
                    if (w3c0Var46 != null && (binding53 = w3c0Var46.a0.getBinding()) != null && (binding54 = binding53.c.getBinding()) != null) {
                        binding54.Y.setVisibility(4);
                    }
                    w3c0 w3c0Var47 = (w3c0) q1c0Var.b;
                    if (w3c0Var47 != null && (binding51 = w3c0Var47.a0.getBinding()) != null && (binding52 = binding51.b.getBinding()) != null) {
                        binding52.b0.setVisibility(4);
                    }
                    w3c0 w3c0Var48 = (w3c0) q1c0Var.b;
                    if (w3c0Var48 != null && (binding49 = w3c0Var48.a0.getBinding()) != null && (binding50 = binding49.c.getBinding()) != null) {
                        binding50.b0.setVisibility(4);
                    }
                }
                return Unit.a;
        }
    }
}
