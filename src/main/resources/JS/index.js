// SIDEBAR
const menuItems = document.querySelectorAll('.menu-item');
const messages = document.querySelector('.messages');
const message = document.querySelectorAll('.message');
const messageSearch = document.querySelector('#message-search');

//theme
const theme = document.querySelector('#theme');
const themeModal = document.querySelector('.customize-theme');
const dm = document.querySelector('#dm');



const messagesNotification = document.querySelector
    ('#messagse-notification');








 



// remove active class from all menu items

const changeActiveItem = () => {
    menuItems.forEach(item => {


        item.classList.remove('active');


    })
}



menuItems.forEach(item => {
    item.addEventListener('click', () => {
        changeActiveItem();
        item.classList.add('active');
        if (item.id != 'notifications') {

            document.querySelector('.notification-popup').style.display = 'none';

        } else {
            document.querySelector('.notification-popup').style.display = 'block';
            document.querySelector('#notifications .notification-count').style.display = 'none';

            if (item.id != 'theme') {
                themeModal.style.display = 'none';

            }

        }

    })
})



theme.addEventListener('click', () => {

    themeModal.style.display = 'grid';


})

dm.addEventListener('click', () => {

    themeModal.style.display = 'none';


})




// searches chats
const searchMessage = () => {
    const val = messageSearch.value.toLowerCase();
    message.forEach(user => {
        let name = user.querySelector('h5').textContent.toLowerCase();
        if (name.indexOf(val) != -1) {
            user.style.display = 'flex';
        } else {

            user.style.display = 'none';
        }
    })
}


// search chat
messageSearch.addEventListener('keyup', searchMessage);





// hightlight messages card when messages menu item is clicked

messagesNotification.addEventListener('click', () => {
    messages.style.boxShadow = '0 0 1rem var(--color-primary) ';
///    messages.style.boxShadow = '0 0 1rem yellow';

    messagesNotification.querySelector('.notification-count').style.display = 'none';

    setTimeout(() => {
        messages.style.boxShadow = 'none';
    }, 2000);
})





/// ------font-----------

var root = document.documentElement;
const fontSizes= document.querySelectorAll('.choose-size span');

const changeActiveSize = () => {
    fontSizes.forEach(item => {


        item.classList.remove('active');


    })
}



fontSizes.forEach(size => {
    let fontSize;
    size.addEventListener('click', () => {
        if (size.classList.contains('font-size-1')) {
    changeActiveSize();
            
        size.classList.add('active');

            fontSize = '12px';
            root.style.setProperty('--sticky-top-left', '5.4rem');
            root.style.setProperty('--sticky-top-right', '5.4rem');
        } else if (size.classList.contains('font-size-2')) {
    changeActiveSize();
        
            size.classList.add('active');

            fontSize = '14px';
            root.style.setProperty('--sticky-top-left', '5.4rem');
            root.style.setProperty('--sticky-top-right', '-7rem');
        } else if (size.classList.contains('font-size-3')) {
    changeActiveSize();
        
            size.classList.add('active');

            fontSize = '16px';
            root.style.setProperty('--sticky-top-left', '-2rem');
            root.style.setProperty('--sticky-top-right', '-17rem');
        } else if (size.classList.contains('font-size-4')) {
    changeActiveSize();
        
            size.classList.add('active');

            fontSize = '18px';
            root.style.setProperty('--sticky-top-left', '-5rem');
            root.style.setProperty('--sticky-top-right', '-25rem');
        } else if (size.classList.contains('font-size-5')) {
            fontSize = '20px';
    changeActiveSize();
        
            size.classList.add('active');

            root.style.setProperty('--sticky-top-left', '-12rem');
            root.style.setProperty('--sticky-top-right', '-35rem');
        }

        // Change font size
        document.querySelector('html').style.fontSize = fontSize;
    });
});




/// ------color-----------

const colorPalette = document.querySelectorAll('.choose-color span');

colorPalette
