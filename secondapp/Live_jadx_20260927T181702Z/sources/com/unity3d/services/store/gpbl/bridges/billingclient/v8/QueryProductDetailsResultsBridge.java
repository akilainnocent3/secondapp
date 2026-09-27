package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import dr.v1;
import fr.h0;
import fr.i0;
import fr.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nQueryProductDetailsResultsBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryProductDetailsResultsBridge.kt\ncom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n26#2:23\n1549#3:24\n1620#3,3:25\n*S KotlinDebug\n*F\n+ 1 QueryProductDetailsResultsBridge.kt\ncom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge\n*L\n6#1:23\n11#1:24\n11#1:25,3\n*E\n"})
public final class QueryProductDetailsResultsBridge extends GenericBridge {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";

    @l
    private final Object productDetailsResult;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(@l Object productDetailsResult) {
        super(m1.k(v1.a(GET_PRODUCT_DETAILS_LIST_METHOD, new Class[0])));
        m0.p(productDetailsResult, "productDetailsResult");
        this.productDetailsResult = productDetailsResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @l
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    @l
    public final List<ProductDetailsBridge> getProductDetailsList() {
        List list = (List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new Object[0]);
        if (list == null) {
            return h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductDetailsBridge(it.next()));
        }
        return arrayList;
    }
}
