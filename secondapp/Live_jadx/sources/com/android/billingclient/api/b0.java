package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    public static final BillingResult A;
    public static final BillingResult B;
    public static final BillingResult C;
    public static final BillingResult D;
    public static final BillingResult E;
    public static final BillingResult F;
    public static final BillingResult G;
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BillingResult f25626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BillingResult f25627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BillingResult f25628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BillingResult f25629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BillingResult f25630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BillingResult f25631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BillingResult f25632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BillingResult f25633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BillingResult f25634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BillingResult f25635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BillingResult f25636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BillingResult f25637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final BillingResult f25638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BillingResult f25639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BillingResult f25640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BillingResult f25641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BillingResult f25642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final BillingResult f25643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final BillingResult f25644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final BillingResult f25645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final BillingResult f25646u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final BillingResult f25647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final BillingResult f25648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final BillingResult f25649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final BillingResult f25650y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final BillingResult f25651z;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(3);
        builderNewBuilder.setDebugMessage("Google Play In-app Billing API version is less than 3");
        f25626a = builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(3);
        builderNewBuilder2.setDebugMessage("Google Play In-app Billing API version is less than 9");
        f25627b = builderNewBuilder2.build();
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(3);
        builderNewBuilder3.setDebugMessage("Billing service unavailable on device.");
        f25628c = builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(2);
        builderNewBuilder4.setDebugMessage("Billing service unavailable on device.");
        f25629d = builderNewBuilder4.build();
        BillingResult.Builder builderNewBuilder5 = BillingResult.newBuilder();
        builderNewBuilder5.setResponseCode(5);
        builderNewBuilder5.setDebugMessage("Client is already in the process of connecting to billing service.");
        f25630e = builderNewBuilder5.build();
        BillingResult.Builder builderNewBuilder6 = BillingResult.newBuilder();
        builderNewBuilder6.setResponseCode(5);
        builderNewBuilder6.setDebugMessage("The list of SKUs can't be empty.");
        f25631f = builderNewBuilder6.build();
        BillingResult.Builder builderNewBuilder7 = BillingResult.newBuilder();
        builderNewBuilder7.setResponseCode(5);
        builderNewBuilder7.setDebugMessage("SKU type can't be empty.");
        f25632g = builderNewBuilder7.build();
        BillingResult.Builder builderNewBuilder8 = BillingResult.newBuilder();
        builderNewBuilder8.setResponseCode(5);
        builderNewBuilder8.setDebugMessage("Product type can't be empty.");
        f25633h = builderNewBuilder8.build();
        BillingResult.Builder builderNewBuilder9 = BillingResult.newBuilder();
        builderNewBuilder9.setResponseCode(-2);
        builderNewBuilder9.setDebugMessage("Client does not support extra params.");
        f25634i = builderNewBuilder9.build();
        BillingResult.Builder builderNewBuilder10 = BillingResult.newBuilder();
        builderNewBuilder10.setResponseCode(5);
        builderNewBuilder10.setDebugMessage("Invalid purchase token.");
        f25635j = builderNewBuilder10.build();
        BillingResult.Builder builderNewBuilder11 = BillingResult.newBuilder();
        builderNewBuilder11.setResponseCode(6);
        builderNewBuilder11.setDebugMessage("An internal error occurred.");
        f25636k = builderNewBuilder11.build();
        BillingResult.Builder builderNewBuilder12 = BillingResult.newBuilder();
        builderNewBuilder12.setResponseCode(5);
        builderNewBuilder12.setDebugMessage("SKU can't be null.");
        builderNewBuilder12.build();
        BillingResult.Builder builderNewBuilder13 = BillingResult.newBuilder();
        builderNewBuilder13.setResponseCode(0);
        f25637l = builderNewBuilder13.build();
        BillingResult.Builder builderNewBuilder14 = BillingResult.newBuilder();
        builderNewBuilder14.setResponseCode(-1);
        builderNewBuilder14.setDebugMessage("Service connection is disconnected.");
        f25638m = builderNewBuilder14.build();
        BillingResult.Builder builderNewBuilder15 = BillingResult.newBuilder();
        builderNewBuilder15.setResponseCode(2);
        builderNewBuilder15.setDebugMessage("Timeout communicating with service.");
        f25639n = builderNewBuilder15.build();
        BillingResult.Builder builderNewBuilder16 = BillingResult.newBuilder();
        builderNewBuilder16.setResponseCode(-2);
        builderNewBuilder16.setDebugMessage("Client does not support subscriptions.");
        f25640o = builderNewBuilder16.build();
        BillingResult.Builder builderNewBuilder17 = BillingResult.newBuilder();
        builderNewBuilder17.setResponseCode(-2);
        builderNewBuilder17.setDebugMessage("Client does not support subscriptions update.");
        f25641p = builderNewBuilder17.build();
        BillingResult.Builder builderNewBuilder18 = BillingResult.newBuilder();
        builderNewBuilder18.setResponseCode(-2);
        builderNewBuilder18.setDebugMessage("Client does not support get purchase history.");
        f25642q = builderNewBuilder18.build();
        BillingResult.Builder builderNewBuilder19 = BillingResult.newBuilder();
        builderNewBuilder19.setResponseCode(-2);
        builderNewBuilder19.setDebugMessage("Client does not support price change confirmation.");
        f25643r = builderNewBuilder19.build();
        BillingResult.Builder builderNewBuilder20 = BillingResult.newBuilder();
        builderNewBuilder20.setResponseCode(-2);
        builderNewBuilder20.setDebugMessage("Play Store version installed does not support cross selling products.");
        f25644s = builderNewBuilder20.build();
        BillingResult.Builder builderNewBuilder21 = BillingResult.newBuilder();
        builderNewBuilder21.setResponseCode(-2);
        builderNewBuilder21.setDebugMessage("Client does not support multi-item purchases.");
        f25645t = builderNewBuilder21.build();
        BillingResult.Builder builderNewBuilder22 = BillingResult.newBuilder();
        builderNewBuilder22.setResponseCode(-2);
        builderNewBuilder22.setDebugMessage("Client does not support offer_id_token.");
        f25646u = builderNewBuilder22.build();
        BillingResult.Builder builderNewBuilder23 = BillingResult.newBuilder();
        builderNewBuilder23.setResponseCode(-2);
        builderNewBuilder23.setDebugMessage("Client does not support ProductDetails.");
        f25647v = builderNewBuilder23.build();
        BillingResult.Builder builderNewBuilder24 = BillingResult.newBuilder();
        builderNewBuilder24.setResponseCode(-2);
        builderNewBuilder24.setDebugMessage("Client does not support in-app messages.");
        f25648w = builderNewBuilder24.build();
        BillingResult.Builder builderNewBuilder25 = BillingResult.newBuilder();
        builderNewBuilder25.setResponseCode(-2);
        builderNewBuilder25.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder25.build();
        BillingResult.Builder builderNewBuilder26 = BillingResult.newBuilder();
        builderNewBuilder26.setResponseCode(-2);
        builderNewBuilder26.setDebugMessage("Play Store version installed does not support external offer.");
        f25649x = builderNewBuilder26.build();
        BillingResult.Builder builderNewBuilder27 = BillingResult.newBuilder();
        builderNewBuilder27.setResponseCode(-2);
        builderNewBuilder27.setDebugMessage("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f25650y = builderNewBuilder27.build();
        BillingResult.Builder builderNewBuilder28 = BillingResult.newBuilder();
        builderNewBuilder28.setResponseCode(5);
        builderNewBuilder28.setDebugMessage("Unknown feature");
        f25651z = builderNewBuilder28.build();
        BillingResult.Builder builderNewBuilder29 = BillingResult.newBuilder();
        builderNewBuilder29.setResponseCode(-2);
        builderNewBuilder29.setDebugMessage("Play Store version installed does not support get billing config.");
        A = builderNewBuilder29.build();
        BillingResult.Builder builderNewBuilder30 = BillingResult.newBuilder();
        builderNewBuilder30.setResponseCode(-2);
        builderNewBuilder30.setDebugMessage("Query product details with serialized docid is not supported.");
        B = builderNewBuilder30.build();
        BillingResult.Builder builderNewBuilder31 = BillingResult.newBuilder();
        builderNewBuilder31.setResponseCode(4);
        builderNewBuilder31.setDebugMessage("Item is unavailable for purchase.");
        C = builderNewBuilder31.build();
        BillingResult.Builder builderNewBuilder32 = BillingResult.newBuilder();
        builderNewBuilder32.setResponseCode(-2);
        builderNewBuilder32.setDebugMessage("Query product details with developer specified account is not supported.");
        D = builderNewBuilder32.build();
        BillingResult.Builder builderNewBuilder33 = BillingResult.newBuilder();
        builderNewBuilder33.setResponseCode(-2);
        builderNewBuilder33.setDebugMessage("Play Store version installed does not support alternative billing only.");
        E = builderNewBuilder33.build();
        BillingResult.Builder builderNewBuilder34 = BillingResult.newBuilder();
        builderNewBuilder34.setResponseCode(5);
        builderNewBuilder34.setDebugMessage("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        F = builderNewBuilder34.build();
        BillingResult.Builder builderNewBuilder35 = BillingResult.newBuilder();
        builderNewBuilder35.setResponseCode(6);
        builderNewBuilder35.setDebugMessage("An error occurred while retrieving billing override.");
        G = builderNewBuilder35.build();
    }

    public static BillingResult a(int i10, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }
}
