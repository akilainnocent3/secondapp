package com.chad.library.adapter.base;

import androidx.recyclerview.widget.n;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.entity.node.NodeFooterImp;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ib5;
import defpackage.zkh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001fJ%\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010!J\u001d\u0010\u001d\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u001eJ)\u0010(\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010,J\u001d\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J%\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b.\u00101J+\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b.\u00102J\u001d\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b3\u00104J\u001d\u00103\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b3\u0010/J%\u00106\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b6\u00101J#\u00107\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b7\u00108J9\u0010=\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b=\u0010>J9\u0010?\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b?\u0010>J9\u0010@\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b@\u0010>J9\u0010A\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\bA\u0010>J9\u0010B\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\bB\u0010>JY\u0010G\u001a\u00020\t2\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010C\u001a\u00020\u00132\b\b\u0002\u0010D\u001a\u00020\u00132\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010E\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010J\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\bJ\u0010LJ\u0017\u0010M\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\bN\u0010LJ/\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\bP\u0010QJC\u0010=\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010R\u001a\u00020\u00132\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010SJC\u0010?\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010T\u001a\u00020\u00132\b\b\u0002\u00109\u001a\u00020\u00132\b\b\u0002\u0010:\u001a\u00020\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b?\u0010SR$\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\u00110Uj\b\u0012\u0004\u0012\u00020\u0011`V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/chad/library/adapter/base/BaseNodeAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "", "nodeList", "<init>", "(Ljava/util/List;)V", "Lcom/chad/library/adapter/base/provider/BaseNodeProvider;", AnalyticsParam.EVENT_STREAM_PROVIDER, "", "addNodeProvider", "(Lcom/chad/library/adapter/base/provider/BaseNodeProvider;)V", "addFullSpanNodeProvider", "addFooterNodeProvider", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "addItemProvider", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "", "type", "", "isFixedViewType", "(I)Z", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "setNewInstance", "", "setList", "(Ljava/util/Collection;)V", "position", "data", "addData", "(ILcom/chad/library/adapter/base/entity/node/BaseNode;)V", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;)V", "newData", "(ILjava/util/Collection;)V", "removeAt", "(I)V", "index", "setData", "Ljava/lang/Runnable;", "commitCallback", "setDiffNewData", "(Ljava/util/List;Ljava/lang/Runnable;)V", "Landroidx/recyclerview/widget/n$d;", "diffResult", "(Landroidx/recyclerview/widget/n$d;Ljava/util/List;)V", "parentNode", "nodeAddData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;Lcom/chad/library/adapter/base/entity/node/BaseNode;)V", "childIndex", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;ILcom/chad/library/adapter/base/entity/node/BaseNode;)V", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;ILjava/util/Collection;)V", "nodeRemoveData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;I)V", "childNode", "nodeSetData", "nodeReplaceChildData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;Ljava/util/Collection;)V", "animate", "notify", "", "parentPayload", "collapse", "(IZZLjava/lang/Object;)I", "expand", "expandOrCollapse", "expandAndChild", "collapseAndChild", "isExpandedChild", "isCollapseChild", "expandPayload", "collapsePayload", "expandAndCollapseOther", "(IZZZZLjava/lang/Object;Ljava/lang/Object;)V", "node", "findParentNode", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;)I", "(I)I", "removeNodesAt", "removeChildAt", "isExpanded", "flatData", "(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;", "isChangeChildCollapse", "(IZZZLjava/lang/Object;)I", "isChangeChildExpand", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "fullSpanNodeTypeSet", "Ljava/util/HashSet;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<BaseNode> {
    private final HashSet<Integer> fullSpanNodeTypeSet;

    public BaseNodeAdapter(List<BaseNode> list) {
        super(null);
        this.fullSpanNodeTypeSet = new HashSet<>();
        if (list == null || list.isEmpty()) {
            return;
        }
        getData().addAll(flatData$default(this, list, null, 2, null));
    }

    private final int collapse(int position, boolean isChangeChildCollapse, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (baseExpandNode.getIsExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + position;
                baseExpandNode.setExpanded(false);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    childNode2.getClass();
                    List<BaseNode> listFlatData = flatData(childNode2, isChangeChildCollapse ? Boolean.FALSE : null);
                    int size = listFlatData.size();
                    getData().removeAll(listFlatData);
                    if (notify) {
                        if (animate) {
                            notifyItemChanged(headerLayoutCount, parentPayload);
                            notifyItemRangeRemoved(headerLayoutCount + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, parentPayload);
            }
        }
        return 0;
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: collapse");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        boolean z4 = z;
        boolean z5 = (i2 & 4) != 0 ? true : z2;
        boolean z6 = (i2 & 8) != 0 ? true : z3;
        if ((i2 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i, z4, z5, z6, obj);
    }

    public static /* synthetic */ int collapseAndChild$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: collapseAndChild");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapseAndChild(i, z, z2, obj);
    }

    private final int expand(int position, boolean isChangeChildExpand, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (!baseExpandNode.getIsExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + position;
                baseExpandNode.setExpanded(true);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    childNode2.getClass();
                    List<BaseNode> listFlatData = flatData(childNode2, isChangeChildExpand ? Boolean.TRUE : null);
                    int size = listFlatData.size();
                    getData().addAll(position + 1, listFlatData);
                    if (notify) {
                        if (animate) {
                            notifyItemChanged(headerLayoutCount, parentPayload);
                            notifyItemRangeInserted(headerLayoutCount + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, parentPayload);
            }
        }
        return 0;
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: expand");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        boolean z4 = z;
        boolean z5 = (i2 & 4) != 0 ? true : z2;
        boolean z6 = (i2 & 8) != 0 ? true : z3;
        if ((i2 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i, z4, z5, z6, obj);
    }

    public static /* synthetic */ int expandAndChild$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: expandAndChild");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandAndChild(i, z, z2, obj);
    }

    public static /* synthetic */ void expandAndCollapseOther$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, boolean z3, boolean z4, Object obj, Object obj2, int i2, Object obj3) {
        if (obj3 == null) {
            baseNodeAdapter.expandAndCollapseOther(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) == 0 ? z4 : true, (i2 & 32) != 0 ? null : obj, (i2 & 64) != 0 ? null : obj2);
        } else {
            zkh.a("Super calls with default arguments not supported in this target, function: expandAndCollapseOther");
        }
    }

    public static /* synthetic */ int expandOrCollapse$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: expandOrCollapse");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandOrCollapse(i, z, z2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<BaseNode> flatData(Collection<? extends BaseNode> list, Boolean isExpanded) {
        BaseNode footerNode;
        List<BaseNode> childNode;
        ArrayList arrayList = new ArrayList();
        for (BaseNode baseNode : list) {
            arrayList.add(baseNode);
            if (baseNode instanceof BaseExpandNode) {
                if ((Intrinsics.g(isExpanded, Boolean.TRUE) || ((BaseExpandNode) baseNode).getIsExpanded()) && (childNode = baseNode.getChildNode()) != null && !childNode.isEmpty()) {
                    arrayList.addAll(flatData(childNode, isExpanded));
                }
                if (isExpanded != null) {
                    ((BaseExpandNode) baseNode).setExpanded(isExpanded.booleanValue());
                }
            } else {
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 != null && !childNode2.isEmpty()) {
                    arrayList.addAll(flatData(childNode2, isExpanded));
                }
            }
            if ((baseNode instanceof NodeFooterImp) && (footerNode = ((NodeFooterImp) baseNode).getFooterNode()) != null) {
                arrayList.add(footerNode);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List flatData$default(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: flatData");
            return null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return baseNodeAdapter.flatData(collection, bool);
    }

    private final int removeChildAt(int position) {
        BaseNode baseNode;
        List<BaseNode> childNode;
        if (position >= getData().size() || (childNode = (baseNode = getData().get(position)).getChildNode()) == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(baseNode instanceof BaseExpandNode)) {
            List<BaseNode> childNode2 = baseNode.getChildNode();
            childNode2.getClass();
            List listFlatData$default = flatData$default(this, childNode2, null, 2, null);
            getData().removeAll(listFlatData$default);
            return listFlatData$default.size();
        }
        if (!((BaseExpandNode) baseNode).getIsExpanded()) {
            return 0;
        }
        List<BaseNode> childNode3 = baseNode.getChildNode();
        childNode3.getClass();
        List listFlatData$default2 = flatData$default(this, childNode3, null, 2, null);
        getData().removeAll(listFlatData$default2);
        return listFlatData$default2.size();
    }

    private final int removeNodesAt(int position) {
        boolean z = false;
        if (position >= getData().size()) {
            return 0;
        }
        int iRemoveChildAt = removeChildAt(position);
        Object obj = (BaseNode) getData().get(position);
        if ((obj instanceof NodeFooterImp) && ((NodeFooterImp) obj).getFooterNode() != null) {
            z = true;
        }
        getData().remove(position);
        int i = iRemoveChildAt + 1;
        if (!z) {
            return i;
        }
        getData().remove(position);
        return iRemoveChildAt + 2;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int position, BaseNode data) {
        data.getClass();
        addData(position, (Collection<? extends BaseNode>) b.f(data));
    }

    public final void addFooterNodeProvider(BaseNodeProvider provider) {
        provider.getClass();
        addFullSpanNodeProvider(provider);
    }

    public final void addFullSpanNodeProvider(BaseNodeProvider provider) {
        provider.getClass();
        this.fullSpanNodeTypeSet.add(Integer.valueOf(provider.getItemViewType()));
        addItemProvider(provider);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public void addItemProvider(BaseItemProvider<BaseNode> provider) {
        provider.getClass();
        if (provider instanceof BaseNodeProvider) {
            super.addItemProvider(provider);
        } else {
            ib5.a("Please add BaseNodeProvider, no BaseItemProvider!");
        }
    }

    public final void addNodeProvider(BaseNodeProvider provider) {
        provider.getClass();
        addItemProvider(provider);
    }

    public final int collapseAndChild(int i) {
        return collapseAndChild$default(this, i, false, false, null, 14, null);
    }

    public final int expandAndChild(int i) {
        return expandAndChild$default(this, i, false, false, null, 14, null);
    }

    public final void expandAndCollapseOther(int position, boolean isExpandedChild, boolean isCollapseChild, boolean animate, boolean notify, Object expandPayload, Object collapsePayload) {
        boolean z;
        Object obj;
        boolean z2;
        int size;
        int i = position;
        int iExpand = expand(i, isExpandedChild, animate, notify, expandPayload);
        if (iExpand == 0) {
            return;
        }
        int iFindParentNode = findParentNode(i);
        int i2 = iFindParentNode == -1 ? 0 : iFindParentNode + 1;
        if (i - i2 > 0) {
            z = isCollapseChild;
            obj = collapsePayload;
            z2 = animate;
            do {
                int iCollapse = collapse(i2, z, z2, notify, obj);
                i2++;
                i -= iCollapse;
            } while (i2 < i);
        } else {
            z = isCollapseChild;
            obj = collapsePayload;
            z2 = animate;
        }
        int i3 = i;
        if (iFindParentNode == -1) {
            size = getData().size() - 1;
        } else {
            List<BaseNode> childNode = getData().get(iFindParentNode).getChildNode();
            size = iFindParentNode + (childNode != null ? childNode.size() : 0) + iExpand;
        }
        int i4 = i3 + iExpand;
        if (i4 < size) {
            int i5 = i4 + 1;
            while (i5 <= size) {
                int iCollapse2 = collapse(i5, z, z2, notify, obj);
                i5++;
                size -= iCollapse2;
            }
        }
    }

    public final int expandOrCollapse(int position, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            return ((BaseExpandNode) baseNode).getIsExpanded() ? collapse(position, false, animate, notify, parentPayload) : expand(position, false, animate, notify, parentPayload);
        }
        return 0;
    }

    public final int findParentNode(BaseNode node) {
        node.getClass();
        int iIndexOf = getData().indexOf(node);
        if (iIndexOf != -1 && iIndexOf != 0) {
            for (int i = iIndexOf - 1; -1 < i; i--) {
                List<BaseNode> childNode = getData().get(i).getChildNode();
                if (childNode != null && childNode.contains(node)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int type) {
        return super.isFixedViewType(type) || this.fullSpanNodeTypeSet.contains(Integer.valueOf(type));
    }

    public final void nodeAddData(BaseNode parentNode, BaseNode data) {
        parentNode.getClass();
        data.getClass();
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(childNode.size() + getData().indexOf(parentNode), data);
            }
        }
    }

    public final void nodeRemoveData(BaseNode parentNode, int childIndex) {
        parentNode.getClass();
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || childIndex >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
            childNode.remove(childIndex);
        } else {
            remove(getData().indexOf(parentNode) + 1 + childIndex);
            childNode.remove(childIndex);
        }
    }

    public final void nodeReplaceChildData(BaseNode parentNode, Collection<? extends BaseNode> newData) {
        parentNode.getClass();
        newData.getClass();
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
                childNode.clear();
                childNode.addAll(newData);
                return;
            }
            int iIndexOf = getData().indexOf(parentNode);
            int iRemoveChildAt = removeChildAt(iIndexOf);
            childNode.clear();
            childNode.addAll(newData);
            List listFlatData$default = flatData$default(this, newData, null, 2, null);
            int i = iIndexOf + 1;
            getData().addAll(i, listFlatData$default);
            int headerLayoutCount = getHeaderLayoutCount() + i;
            if (iRemoveChildAt == listFlatData$default.size()) {
                notifyItemRangeChanged(headerLayoutCount, iRemoveChildAt);
            } else {
                notifyItemRangeRemoved(headerLayoutCount, iRemoveChildAt);
                notifyItemRangeInserted(headerLayoutCount, listFlatData$default.size());
            }
        }
    }

    public final void nodeSetData(BaseNode parentNode, int childIndex, BaseNode data) {
        parentNode.getClass();
        data.getClass();
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || childIndex >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
            childNode.set(childIndex, data);
        } else {
            setData(getData().indexOf(parentNode) + 1 + childIndex, data);
            childNode.set(childIndex, data);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int position) {
        notifyItemRangeRemoved(getHeaderLayoutCount() + position, removeNodesAt(position));
        compatibilityDataSizeChanged(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setData(int index, BaseNode data) {
        data.getClass();
        int iRemoveNodesAt = removeNodesAt(index);
        List listFlatData$default = flatData$default(this, b.f(data), null, 2, null);
        getData().addAll(index, listFlatData$default);
        if (iRemoveNodesAt == listFlatData$default.size()) {
            notifyItemRangeChanged(getHeaderLayoutCount() + index, iRemoveNodesAt);
        } else {
            notifyItemRangeRemoved(getHeaderLayoutCount() + index, iRemoveNodesAt);
            notifyItemRangeInserted(getHeaderLayoutCount() + index, listFlatData$default.size());
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(List<BaseNode> list, Runnable commitCallback) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setDiffNewData(flatData$default(this, list, null, 2, null), commitCallback);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setList(Collection<? extends BaseNode> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setList(flatData$default(this, list, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewInstance(List<BaseNode> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setNewInstance(flatData$default(this, list, null, 2, null));
    }

    public final int collapseAndChild(int i, boolean z) {
        return collapseAndChild$default(this, i, z, false, null, 12, null);
    }

    public final int expandAndChild(int i, boolean z) {
        return expandAndChild$default(this, i, z, false, null, 12, null);
    }

    public final int collapseAndChild(int i, boolean z, boolean z2) {
        return collapseAndChild$default(this, i, z, z2, null, 8, null);
    }

    public final int expandAndChild(int i, boolean z, boolean z2) {
        return expandAndChild$default(this, i, z, z2, null, 8, null);
    }

    public final int collapseAndChild(int position, boolean animate, boolean notify, Object parentPayload) {
        return collapse(position, true, animate, notify, parentPayload);
    }

    public final int expandAndChild(int position, boolean animate, boolean notify, Object parentPayload) {
        return expand(position, true, animate, notify, parentPayload);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(BaseNode data) {
        data.getClass();
        addData((Collection<? extends BaseNode>) b.f(data));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int position, Collection<? extends BaseNode> newData) {
        newData.getClass();
        super.addData(position, (Collection) flatData$default(this, newData, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(Collection<? extends BaseNode> newData) {
        newData.getClass();
        super.addData((Collection) flatData$default(this, newData, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(n.d diffResult, List<BaseNode> list) {
        diffResult.getClass();
        list.getClass();
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, flatData$default(this, list, null, 2, null));
        }
    }

    public /* synthetic */ BaseNodeAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseNodeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: collapse");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i, z, z2, obj);
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i, boolean z, boolean z2, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: expand");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i, z, z2, obj);
    }

    public final int expandOrCollapse(int i, boolean z) {
        return expandOrCollapse$default(this, i, z, false, null, 12, null);
    }

    public final void nodeAddData(BaseNode parentNode, int childIndex, BaseNode data) {
        parentNode.getClass();
        data.getClass();
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(childIndex, data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + childIndex, data);
            }
        }
    }

    public final int expandOrCollapse(int i, boolean z, boolean z2) {
        return expandOrCollapse$default(this, i, z, z2, null, 8, null);
    }

    public final int findParentNode(int position) {
        if (position != 0) {
            BaseNode baseNode = getData().get(position);
            for (int i = position - 1; -1 < i; i--) {
                List<BaseNode> childNode = getData().get(i).getChildNode();
                if (childNode != null && childNode.contains(baseNode)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int expandOrCollapse(int i) {
        return expandOrCollapse$default(this, i, false, false, null, 14, null);
    }

    public final void nodeAddData(BaseNode parentNode, int childIndex, Collection<? extends BaseNode> newData) {
        parentNode.getClass();
        newData.getClass();
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.addAll(childIndex, newData);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + childIndex, newData);
            }
        }
    }

    public final void nodeRemoveData(BaseNode parentNode, BaseNode childNode) {
        parentNode.getClass();
        childNode.getClass();
        List<BaseNode> childNode2 = parentNode.getChildNode();
        if (childNode2 != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
                childNode2.remove(childNode);
            } else {
                remove(childNode);
                childNode2.remove(childNode);
            }
        }
    }

    public final int collapse(int i, boolean z) {
        return collapse$default(this, i, z, false, null, 12, null);
    }

    public final int collapse(int i, boolean z, boolean z2) {
        return collapse$default(this, i, z, z2, null, 8, null);
    }

    public final int expand(int i, boolean z) {
        return expand$default(this, i, z, false, null, 12, null);
    }

    public final int collapse(int i) {
        return collapse$default(this, i, false, false, null, 14, null);
    }

    public final int expand(int i, boolean z, boolean z2) {
        return expand$default(this, i, z, z2, null, 8, null);
    }

    public final int collapse(int position, boolean animate, boolean notify, Object parentPayload) {
        return collapse(position, false, animate, notify, parentPayload);
    }

    public final int expand(int i) {
        return expand$default(this, i, false, false, null, 14, null);
    }

    public final int expand(int position, boolean animate, boolean notify, Object parentPayload) {
        return expand(position, false, animate, notify, parentPayload);
    }

    public final void expandAndCollapseOther(int i, boolean z) {
        expandAndCollapseOther$default(this, i, z, false, false, false, null, null, 124, null);
    }

    public final void expandAndCollapseOther(int i, boolean z, boolean z2) {
        expandAndCollapseOther$default(this, i, z, z2, false, false, null, null, 120, null);
    }

    public final void expandAndCollapseOther(int i, boolean z, boolean z2, boolean z3) {
        expandAndCollapseOther$default(this, i, z, z2, z3, false, null, null, 112, null);
    }

    public final void expandAndCollapseOther(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        expandAndCollapseOther$default(this, i, z, z2, z3, z4, null, null, 96, null);
    }

    public final void expandAndCollapseOther(int i, boolean z, boolean z2, boolean z3, boolean z4, Object obj) {
        expandAndCollapseOther$default(this, i, z, z2, z3, z4, obj, null, 64, null);
    }

    public final void expandAndCollapseOther(int i) {
        expandAndCollapseOther$default(this, i, false, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }
}
