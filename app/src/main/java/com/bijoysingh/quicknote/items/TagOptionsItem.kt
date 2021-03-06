package com.bijoysingh.quicknote.items

import android.view.View
import com.bijoysingh.quicknote.R
import com.bijoysingh.quicknote.database.Tag

class TagOptionsItem(
    val tag: Tag,
    val selected: Boolean = false,
    val editable: Boolean = false,
    val editListener: View.OnClickListener? = null,
    val listener: View.OnClickListener) {

  fun getIcon(): Int = when (selected) {
    true -> R.drawable.ic_action_label
    false -> R.drawable.ic_action_label_unselected
  }

  fun getEditIcon(): Int = R.drawable.ic_edit_white_48dp
}