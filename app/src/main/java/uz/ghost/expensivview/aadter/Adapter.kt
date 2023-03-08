package uz.ghost.expensivview.aadter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import kotlinx.coroutines.NonDisposableHandle.parent
import uz.ghost.expensivview.databinding.ItemChildBinding
import uz.ghost.expensivview.databinding.ItemParentBinding

 class Adapter (val titlelist:ArrayList<String>, val map:HashMap<String, ArrayList<String>>): BaseExpandableListAdapter(){
    override fun getGroupCount(): Int = titlelist.size

    override fun getChildrenCount(groupPosition: Int): Int {
        return map[titlelist[groupPosition]]?.size !!
    }

    override fun getGroup(groupPosition: Int): Any {
        return  titlelist[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        val list = map[titlelist[groupPosition]]!!
        return list[childPosition]
    }
    override fun getGroupId(groupPosition: Int): Long {
     return groupPosition.toLong()
    }
    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
     return groupPosition.toLong()
    }
    override fun hasStableIds(): Boolean = true

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        val itemGroupBinding = ItemParentBinding.inflate(LayoutInflater.from(parent?.context) ,parent,false)
        itemGroupBinding.tvName.text = titlelist[groupPosition]
        return itemGroupBinding.root
    }

     override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View?  {
        val itemChildBinding =
            ItemChildBinding.inflate(LayoutInflater.from(parent?.context), parent, false)
        itemChildBinding.tvName.text = map[titlelist[groupPosition]]?.get(childPosition)
         return itemChildBinding.root
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
      return true
    }
}